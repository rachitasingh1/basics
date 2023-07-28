public class MyFunctionalInterfaceImplWithOverridingDefault implements MyFunctionalInterface {

    @Override
    public void onlyAbstractMethod() {
        System.out.println("dummy print statement");
    }

    public void printSomething() {
        System.out.println("overridden this now.");
    }

    public static void main(String[] args) {
        MyFunctionalInterfaceImplWithOverridingDefault test = new MyFunctionalInterfaceImplWithOverridingDefault();
        test.printSomething();
    }

}
