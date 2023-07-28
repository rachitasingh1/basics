public class Outer {
    static int x = 10;
    private int y = 11;

    public class Inner {
        void print() {
            System.out.println(x);
            System.out.println(y);
        }
    }

    public static void main(String... m) {
        Outer out = new Outer();
        Outer.Inner inner = out.new Inner();
        inner.print();
    }
}
