public class AnotherChild extends Base {
    // parent and child have same data member x, so this concept is called data
    // hiding/shawdowing
    int x = 50;

    void get() {
        System.out.println(x);
        // System.out.println(super.x);
    }

    public static void main(String... m) {
        AnotherChild child = new AnotherChild();
        // data hiding: as this prints the child x
        // priority always goes to local
        child.get();
    }
}
