import java.util.Scanner;

public class Voting {
    public static void main(String... m) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = s.nextInt();
        s.close();
        try {
            if (age < 18) {
                throw new MyCustomException("You are not eligible for voting.");
            } else {
                System.out.println("Happy voting!");
            }
        } catch (MyCustomException custom) {
            custom.printStackTrace();
            System.out.println(custom.getMessage());
        } finally {
            System.out.println("Finally.");
        }
        System.out.println("program ends.");
    }
}
