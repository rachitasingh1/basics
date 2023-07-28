public class AlsoAChild extends Base {

    int y = 55;

    void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(super.x);
        System.out.println(this);
        System.out.println(this.hashCode());
        super.methodBase();
        // System.out.println(super.z);
    }

    public static void main(String... m) {
        AlsoAChild child = new AlsoAChild();
        child.display();
    }
}
