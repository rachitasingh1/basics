public class ToStringHashCode {

    public void display() {
        System.out.println("this: display: " + this);
    }

    public static void main(String... s) {
        ToStringHashCode sh = new ToStringHashCode();
        sh.display();
        // this keyword cannot be used in any static context because static functions
        // work without creating objects
        // and this associated with the current object.
        // System.out.println("this: "+ this);
        System.out.println("this: main: hashcode " + sh.hashCode());
        System.out.println("this: main: tostring " + sh.toString());
    }
}
