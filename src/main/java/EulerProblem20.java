/**
 * Problem 20: Factorial digit sum
 * n! means n (n 1) ... 3 2 1
 *
 * For example, 10! = 10   9   ...   3   2   1 = 3628800,
 *
 * and the sum of the digits in the number 10! is
 * 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *
 * Find the sum of the digits in the number 100!
 *
 */
public class EulerProblem20 {
    public static void main(String[] args) {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        FactorialHandler factorialHandler = new FactorialHandler();
        SumHandler sumHandler = new SumHandler();

        sumHandler
                .handle(factorialHandler
                        .handle(sequenceGenerator
                                .createNumberSequence(10)))
                .subscribe(System.out::println);

    }
}
