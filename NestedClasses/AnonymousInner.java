abstract class DisplayData {
    abstract void display();
}

public class AnonymousInner {

    public static void main(String... t) {
        DisplayData data = new DisplayData() {
            void display() {
                System.out.println("nice fruits");
            }
        };
        data.display();
    }
}
