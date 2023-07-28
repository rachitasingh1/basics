public class ConstructorChaining {
    ConstructorChaining() {
        System.out.println("Default constructor. Hello. ");
    }

    ConstructorChaining(String name) {
        this();
        System.out.println("string argument. name becomes : " + name);

    }

    ConstructorChaining(String name, int ID) {
        this("Ria");
        System.out.println("string argument and id details. Name : " + name + "ID : " + ID);

    }

    public static void main(String... s) {
        new ConstructorChaining("Rachita", 324);
    }
}
