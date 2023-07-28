package InterviewCodingQs;

import java.util.stream.*;
import java.util.*;

// import java.util.*;

public class SqrtFirst10PrimeNums {
    public static void main(String[] args) {
        List<Double> sqrtOf10Prime = Stream.iterate(1, i -> i + 1)
                .filter(SqrtFirst10PrimeNums::isPrime).peek(x -> System.out.println(x))
                .map(Math::sqrt)
                .limit(10)
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(n -> number % n == 0);
    }
}
