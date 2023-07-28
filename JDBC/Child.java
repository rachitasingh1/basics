public class Child extends Parent {

    public int sum(int a, int b) {
        super.sum(2, 4);
        System.out.println("From child");
        return a + b;  
    }

    public static void main(String... s) {

        Child child = new Child();
        System.out.println(child.sum(2, 4));

        // Parent parent = new Parent();
        // System.out.println(super.sum(2, 4));

    }
}
