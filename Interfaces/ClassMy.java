public class ClassMy implements InterfaceMy {

    public void something() {
        System.out.println("Something...");
    }

    public void somethingElse() {
        System.out.println("Something else...");
    }

    // public String toString(){
    //     return "overloaded toString";
    // }

    public static void main(String[] args) {
        ClassMy my = new ClassMy();
        my.something();

        InterfaceMy myinterface = new ClassMy();
        // myinterface.somethingElse();

        myinterface.toString();
    }
}
