//program to practice String class methods concat/ + operator concatenation/ join/ substring/ etc

public class StringConcat {
    public static void main(String... t) {
        String s1 = "Hey";
        String s2 = " There!";
        String s3 = " alpha";
        String s4 = " beta";
        String s5 = " gamma";
        String s6 = "Its a very humid day.";

        System.out.println(s1 + s2);
        System.out.println(s1 + 10);// here, this 10 is treated as a string
        System.out.println(s1 + 10 + 20);
        System.out.println(10 + 20 + s1);
        System.out.println(10 + 20 + 40 + s1 + 10 / 2);
        System.out.println(10 + 20 * 40 + s1 + 10 / 2);
        System.out.println(String.join("/", s3, s4, s5));
        System.out.println(String.join(" and", s3, s4, s5));
        System.out.println(s6.subSequence(3, 9));
        System.out.println(s6.substring(7));
        System.out.println(s6.substring(2, 5));

    }
}
