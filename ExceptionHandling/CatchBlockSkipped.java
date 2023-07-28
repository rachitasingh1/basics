import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CatchBlockSkipped {
    public static void main(String... t) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        try {
            System.out.println(5 / 2);
            FileInputStream fis = new FileInputStream("null");
        } catch (ArithmeticException ae) {
            System.out.println("Exception occured: " + ae);
            ae.printStackTrace();
            System.out.println(6);
            System.out.println(7);
            System.out.println(8);
        } catch (FileNotFoundException file) {
            System.out.println(file);
            System.out.println(file.toString());
            System.out.println(file.getMessage());
            System.out.println(file.getStackTrace());
            file.printStackTrace();
        }
        System.out.println(9);
        System.out.println(10);

    }

}
