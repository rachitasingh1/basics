public class EqualsTest {
    public static void main(String[] args) {
        String x = new String("str");
        String y = new String("str");

        System.out.println(x == y); // prints false
        System.out.println(x.equals(y)); // prints true
    }
}
