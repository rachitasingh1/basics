public class ChildBase extends Base {
    int x = 10;

    public static void main(String... m) {
        ChildBase child = new ChildBase();
        System.out.println("Value of x is : " + child.x);
        System.out.println("Value of Base x is : " + ((Base) child).x);
    }
}
