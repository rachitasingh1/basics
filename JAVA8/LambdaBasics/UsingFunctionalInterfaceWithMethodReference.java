public class UsingFunctionalInterfaceWithMethodReference {
    public static void main(String[] args) {
        MyFunctionalInterface my = SomeRandomClass::printSomething;
        my.onlyAbstractMethod();


        MyFunctionalInterface mytoo = ()->System.out.println("Using Lambda.");
        mytoo.onlyAbstractMethod();
    }
}
