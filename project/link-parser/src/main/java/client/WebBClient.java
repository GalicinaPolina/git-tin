package client;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class WebBClient {

    @Bean
    public static ClientResponse createWebClient(ClientRequest request) {
        WebClient webClient = WebClient.builder().baseUrl("http://localhost:8080").build();

        ClientResponse response = webClient.post().uri("/url:{url}")
                .body(Mono.just(request), ClientRequest.class)
                .retrieve()
                .bodyToMono(ClientResponse.class)
                .block();

        return response;
    }
}