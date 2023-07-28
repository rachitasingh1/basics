import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class CheckedExceptionExample {
    public static void main(String... m) {
        try {
            
            FileInputStream fis = new FileInputStream("null");
           
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Test");
    }
}