package tinkGr.backend;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URISyntaxException;
public final class GitHubURL implements Links {
    public String getData(String URL){
        String[] splitedURL = URL.split("/");
        String fback = "Name: "+splitedURL[3]+" Repo: "+splitedURL[4];
        return fback;
    }
    public Mono<String> getAllLinks(String URL) throws URISyntaxException {
        WebClient client = WebClient.create();

        WebClient.ResponseSpec responseSpec = client.get()
                .uri(URL)
                .retrieve();
        Mono<String> responseBody = responseSpec.bodyToMono(String.class);
        return responseBody;
    }
}