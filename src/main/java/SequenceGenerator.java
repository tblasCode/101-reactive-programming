import reactor.core.publisher.Flux;

public class SequenceGenerator {
    public Flux<Integer> createNumberSequence(int count) {
        return Flux.range(1, count);
    }
}
