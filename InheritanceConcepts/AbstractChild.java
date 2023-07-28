public class AbstractChild extends AbstractBase {

    // @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("Hello");
    }

    public static void main(String... t) {
        System.out.println("From main");
        AbstractChild child = new AbstractChild();
        child.show();
    }

}
