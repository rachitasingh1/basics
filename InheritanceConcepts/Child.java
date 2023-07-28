public class Child extends Parent {

    int x;
    int y;

    Child() {
        super(10, 12);
        System.out.println("Hello from child");
    }

    public void display() {
        System.out.println("Hello from Child");
    }

    public void displayagain() {
        System.out.println("Hello from Child again");
    }

    public static void main(String... t) {
        Parent parent = new Child();
        parent.display();
        // child.displayagain();
        // child.printThis();
    }
}
