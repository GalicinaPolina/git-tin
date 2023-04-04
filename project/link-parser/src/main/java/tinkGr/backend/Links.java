package tinkGr.backend;
import reactor.core.publisher.Mono;

import java.net.URISyntaxException;
public sealed interface Links permits GitHubURL, StackOverflowURL {
    default String getData(String URL){
        return "null";
    }
    default Mono<String> getAllLinks(String URL) throws URISyntaxException {
        return null;
    }
}