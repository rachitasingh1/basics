interface Foo {
    String name = "Foo";

    void print();
}

public class FooBar implements Foo {
    String name = "Bar";

    public void print() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Foo foo = new FooBar();
        foo.print();
    }
}
