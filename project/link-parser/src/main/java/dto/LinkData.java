package dto;
import reactor.core.publisher.Mono;
public record LinkData(String data, Mono<String> links) {
}
