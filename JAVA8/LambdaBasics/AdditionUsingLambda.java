import java.util.function.BiConsumer;

public class AdditionUsingLambda {

    // public void add(int a, int b) {
    // System.out.println("additin result : " + (a + b));
    // }

    public static void main(String[] args) {
        // AdditionUsingLambda add = new AdditionUsingLambda();
        // add.add(12, 8);

        BiConsumer<Integer, Integer> bi = (a, b) -> System.out.printl n(a + b);
        bi.accept(2, 89);
    }
}
