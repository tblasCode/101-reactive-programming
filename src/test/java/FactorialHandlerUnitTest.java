import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

public class FactorialHandlerUnitTest {
    @Test
    public void whenHandlerFactorial_thenFactorialToSequenceIsProduced() {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        FactorialHandler factorialHandler = new FactorialHandler();

        StepVerifier.create(factorialHandler.handle(sequenceGenerator.createNumberSequence(10)))
                .expectNext(3628800)
                .expectComplete()
                .verify();
    }
}