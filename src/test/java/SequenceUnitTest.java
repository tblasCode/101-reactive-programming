import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

public class SequenceUnitTest {
    @Test
    public void whenGeneratingNumbers_thenSequenceIsProduced() {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();

        StepVerifier.create(sequenceGenerator.createNumberSequence(10))
                .expectNext(1, 2, 3,4,5,6,7,8,9,10)
                .expectComplete()
                .verify();
    }
}