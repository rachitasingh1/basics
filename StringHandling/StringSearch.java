public class StringSearch {
    public static void main(String... t) {
        String r = "Rachita";
        System.out.println(r.indexOf("i"));// starts search from beginning
        System.out.println(r.lastIndexOf("i"));// starts search from last
        System.out.println(r.charAt(6));
        System.out.println(r.contains("x"));
        System.out.println(r.startsWith("R"));
        System.out.println(r.endsWith("a"));
    }
}
