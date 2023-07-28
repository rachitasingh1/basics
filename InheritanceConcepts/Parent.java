class Parent // extends GrandParent
{
    int x;
    int y;

    Parent() {
        System.out.println("Hello from parent ");
    }

    Parent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Hello from parent");
        printThis();
    }

    private void printThis() {
        System.out.println("Hello from parent printthis");
    }

    public static void main(String... t) {

    }
}