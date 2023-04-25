package app;
import org.springframework.web.bind.annotation.*;
import java.net.URISyntaxException;
import tinkGr.backend.BackendLinkParser;
import dto.*;
@RestController
public class LinkParserController {
    @GetMapping("/")
    @ResponseBody
    String hello() {
        return "<html>Go to http://localhost:8080/url:?url=URL with correct URL so it starts working</html>";
    }

    @GetMapping("/url:{url}")
    @ResponseBody
    public String getUrl(@PathVariable String url) throws URISyntaxException {
        BackendLinkParser linkParser = new BackendLinkParser(url);
        return linkParser.getData();
    }
    @PostMapping("/url")
    public String getUrl(@RequestBody IncomingLink url) throws URISyntaxException {
        BackendLinkParser linkParser = new BackendLinkParser(url.url());
        return linkParser.getData();
    }

}