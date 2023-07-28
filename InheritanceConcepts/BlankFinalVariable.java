public class BlankFinalVariable {
    final int x;

    BlankFinalVariable(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("value of x is :" + x);
    }

    public String toString() {
        return "Hello there";
    }

    public static void main(String... t) {
        BlankFinalVariable blank = new BlankFinalVariable(22);
        blank.display();
        System.out.println(blank);
    }
}
