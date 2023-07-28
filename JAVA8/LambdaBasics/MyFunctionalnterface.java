@FunctionalInterface
interface MyFunctionalInterface {
    public void onlyAbstractMethod();

    // public void anotherAbstractMethod();
    default void defaultMethod() {
        System.out.println("this is allowed");
    }

    default void anotherDefaultMethod() {
        System.out.println("this is also allowed");
    }

    default void printSomething() {
        System.out.println("Testing default method use.");
    }

    
}