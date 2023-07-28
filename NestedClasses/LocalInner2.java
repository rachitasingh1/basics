public class LocalInner2 {
    void display() {
        int value = 50;// local variable must be final till jdk 1.7 only
        class Local {
            void msg() {
                System.out.println(value);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        LocalInner2 obj = new LocalInner2();
        obj.display();
    }
}