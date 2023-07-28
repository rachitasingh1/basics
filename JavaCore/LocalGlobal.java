public class LocalGlobal {
    int x = 10;

    public void display(int x) {

        System.out.println("The value of local x is : " + x);
        System.out.println("this: display: "+ this);
    }

    public static void main(String... s) {
        int x = 15;
        LocalGlobal lg = new LocalGlobal();
        lg.display(20);
        System.out.println("The value of class x is : " + lg.x);
        System.out.println("The value of main x  is : " + x);
        System.out.println("this: main: hashcode "+ lg.hashCode());
        System.out.println("this: main: tostring "+ lg.toString());



    }
}
