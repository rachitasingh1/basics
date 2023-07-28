public class UpdateString {
    public static void main(String... f) {
        String s= "This is a good book.";
        System.out.println(s.replace("is","was"));
        System.out.println(s.replace('a','x'));
        System.out.println(s.replaceFirst("is", "was"));
        System.out.println(s.replaceAll("is", "was"));
        System.out.println(s.replaceAll("is(.)", "was"));
        System.out.println(s.replaceAll("is(.*)", "was"));
    }
}
