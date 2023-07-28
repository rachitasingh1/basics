public class InterfaceChild implements InterfaceBase {

    @Override
    public void show() {
        System.out.println("Hello from show " + this.x);
    }

    static void display() {
        System.out.println("Hey child");
    }

    public static void main(String... t) {
        InterfaceChild c = new InterfaceChild();
        c.show();
        c.display();
        System.out.println("value of x is : "+InterfaceBase.x);
    }

}
