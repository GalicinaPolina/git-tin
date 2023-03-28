package app;
import dto.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/tg-chat")
@RestController
public class ScrapperTelegramChatController {
    @ApiResponse(responseCode = "200", description = "Зарегистрирован чат")
    @ApiResponse(responseCode = "400", description = "Некорректный запрос")
    @ApiResponse(responseCode = "404", description = "Ссылка не найдена")
    @PostMapping("/{id}")
    String registrateChat(@PathVariable int id){
        return "Chat Id: " + id;
    }
    @DeleteMapping("/{id}")
    String deleteChat(@PathVariable int id){
        return "Chat Id: " + id;
    }
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiErrorResponse handleException(MethodArgumentNotValidException e){
        return new ApiErrorResponse("Некорректный запрос",
                e.getStatusCode().toString(),
                e.getObjectName(),
                e.getLocalizedMessage(),
                new String[]{String.valueOf(e.getStackTrace())});
    }
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiErrorResponse linkException(MethodArgumentNotValidException e){
        return new ApiErrorResponse("Ссылка не найдена",
                e.getStatusCode().toString(),
                e.getObjectName(),
                e.getLocalizedMessage(),
                new String[]{String.valueOf(e.getStackTrace())});
    }
}

