class StaticNested {
    static private int data = 30;

    static class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    static class Inner2 {
        static void msg() {
            System.out.println("data is again: " + data);
        }
    }

    public static void main(String args[]) {
        StaticNested.Inner obj = new StaticNested.Inner();
        obj.msg();//for static nested class with instance method
        StaticNested.Inner2.msg();// for static nested class with static method
    }
}