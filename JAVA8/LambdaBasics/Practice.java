import java.util.function.BiConsumer;
import java.util.function.Function;

public class Practice {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> consumer = (a, b) -> System.out.println(a + b);
        consumer.accept(2, 4);
    }
}
