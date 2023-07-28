package InterviewCodingQs;

import java.util.function.BiConsumer;

public class MultiplyUsingFunctionalInterface {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> consumer = (a,b)->System.out.println(a*b);
        consumer.accept(3, 9);
    }

}
