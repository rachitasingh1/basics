public class Child3 extends Parent3 {
    int x = 99;

    public void show() {
        System.out.println("Child 3 show ");
    }

    public void display() {
        System.out.println("Child 3 display");
    }

    public static void test() {
        System.out.println("Child 3 test");
    }

    public static void main(String... t) {
        Parent3 p = new Child3();
        p.show();
        System.out.println(p.x);
        // parent class reference variable cannot call the personal methods of the child
        // class
        // p.display();
        p.test();
        // DOWNCASTING
        Child3 c = (Child3) p;
        c.show();
        c.test();
    }
}
