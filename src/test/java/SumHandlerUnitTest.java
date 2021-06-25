import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

public class SumHandlerUnitTest {
    @Test
    public void whenHandlerSumOfFactorial_thenSumOfFactorialIsOk() {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        FactorialHandler factorialHandler = new FactorialHandler();
        SumHandler sumHandler = new SumHandler();

        StepVerifier.create(sumHandler.handle(factorialHandler.handle(sequenceGenerator.createNumberSequence(10))))
                .expectNext(27)
                .expectComplete()
                .verify();
    }
}