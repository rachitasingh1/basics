class DivideByZeroExceptionHandling {
    public static void main(String... t) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("Exception occured: " +ae);
            ae.printStackTrace();
        }
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

    }
}