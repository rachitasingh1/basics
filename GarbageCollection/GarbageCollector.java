class GarbageCollector {
    public static void main(String... m) throws InterruptedException {
        Demo d1 = new Demo(10, 33);
        show();
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());
        System.gc();
        // Thread.sleep(10000);

    }

    static void show() {
        Demo d2 = new Demo(1, 3);
        display();
    }

    static void display() {
        Demo d3 = new Demo(22, 9);
    }
}