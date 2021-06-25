import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FactorialHandler {
    public Mono<Integer> handle(Flux<Integer> sequence) {
        //return sequence.collect(Collectors.reducing((i1, i2) -> i1 * i2))
        //        .map(op -> op.get());


        return sequence.reduce(1, (x, y) -> x * y)
                .doOnNext(System.out::println);
    }
}