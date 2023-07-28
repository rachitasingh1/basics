interface Eatable {
    void eat();
}

public class AnonymousInner2 {
    public static void main(String... s) {
        Eatable eat = new Eatable() {
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        eat.eat();
    }
}
