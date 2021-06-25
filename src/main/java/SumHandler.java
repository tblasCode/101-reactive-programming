import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class SumHandler {
    public Mono<Integer> handle(Mono<Integer> input) {
        return input.flatMapMany(resultF -> Flux.just(Integer.toString(resultF).split("(?<=.)")))
                .map(s ->  Integer.valueOf(String.valueOf(s)))
                .reduce((a, b) -> a + b);
    }
}