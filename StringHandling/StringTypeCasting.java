public class StringTypeCasting {
    public static void main(String... t) {
        String sentence = "That is not a very bright idea.";
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        // ___________________________________________________
        int a = 10;
        int b = 60;
        System.out.println(a + b);
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        System.out.println(s1 + s2);

        char[] ch = sentence.toCharArray();
        System.out.println(ch);
    }
}
