class Outer {
    private int num = 175;

    public class Inner_Demo {
        public int getNum() {
            return num;
        }
    }
}

public class OuterInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner_Demo inner = new Outer.Inner_Demo();
        System.out.println(inner.getNum());

    }
}
