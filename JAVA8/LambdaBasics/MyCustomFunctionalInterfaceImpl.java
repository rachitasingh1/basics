public class MyCustomFunctionalInterfaceImpl implements MyCustomFunctionalInterface {
    public static void main(String[] args) {
        MyCustomFunctionalInterface my = () -> System.out.println("Hey");
        my.printSomething();

        MyCustomFunctionalInterface my1 = Test :: printSomething;
        my1.printSomething();
    }
}
