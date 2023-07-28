//methods: abstract and public and (default and static allowed since java8)
//variables: public , static and final

public interface InterfaceBase {
    // blank final variable
    int x = 10;

    void show();

    static void display() {
        System.out.println("Hey base");
    }
}
