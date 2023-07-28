public class DefaultConstructorError {
    DefaultConstructorError(String name) {
        System.out.println("Name is : " + name);
    }

    public static void main(String... s) {
        new DefaultConstructorError("Rachita");
        // once the parameterized constructor is supplied by the programmer, java never
        // creates another constructor. not even a default constructor.
        // new DefaultConstructorError();
    }
}
