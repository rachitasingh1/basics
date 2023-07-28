public class InterfaceDemoImplementation implements InterfaceDemo {

    public void display() {
        System.out.println("Hey");
    }

    public static void main(String[] args) {
        InterfaceDemo demo = new InterfaceDemoImplementation();
        demo.display();
    }
}
