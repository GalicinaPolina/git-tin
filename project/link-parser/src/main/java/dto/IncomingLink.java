package dto;
import jakarta.validation.constraints.NotNull;
public record IncomingLink(@NotNull String url) {
}
