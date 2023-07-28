@FunctionalInterface
public interface MyOwnFunctionalInterface {
    abstract void singleAbstractMethod();
    abstract void anotherAbstractMethod();

    default void printName() {
        System.out.println("Hey");
    }
    default void printAgain() {
        System.out.println("Heyyy");
    }
}
