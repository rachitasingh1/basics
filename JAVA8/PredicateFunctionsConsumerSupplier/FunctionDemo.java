package PredicateFunctionsConsumerSupplier;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> squareMe = i -> i * i;
        Function<Integer, Integer> doubleMe = i -> i * 2;
        Function<Integer, Integer> cubeMe = i -> i*i*i;

        System.out.println(squareMe.apply(3));
        System.out.println(cubeMe.apply(3));
        System.out.println(squareMe.andThen(cubeMe).andThen(doubleMe).apply(3));
        System.out.println(squareMe.compose(cubeMe).apply(3));
    }
}
