public class Demo {
    int x;
    int y;

    Demo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void finalize() throws Throwable {
        System.out.println("Garbage collected.");
    }
}
