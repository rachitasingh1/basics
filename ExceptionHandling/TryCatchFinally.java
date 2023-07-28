public class TryCatchFinally {
    public static void main(String... m) {
        try {
            int c = 50 / 0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Hello from finally block.");
        }
        System.out.println("gghdajfhkjk");
    }
}
