public class CustomFunctionalInterfaceImpl {
    public static void main(String[] args) {

        CustomFunctionalInterface custom = () -> System.out.println("Some message....");
        custom.printSomething();

    }
}
