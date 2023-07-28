public class FinalKeyword {

    static final int x = 1992;

    // FinalKeyword(int x) {
    // FinalKeyword.x = x;
    // }

    public void display() {
        System.out.println("Value of x is : " + x);
    }

    public static void main(String... t) {
        final FinalKeyword fk = new FinalKeyword();
        fk.display();
        // fk = new FinalKeyword();

    }
}
