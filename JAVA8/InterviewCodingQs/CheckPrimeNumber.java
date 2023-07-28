package InterviewCodingQs;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = num -> num > 1 && IntStream.range(2, num).noneMatch(n -> num % n == 0);
        System.out.println(isPrime.test(8));

    }

   
}
