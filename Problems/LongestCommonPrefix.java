public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        String common = String.valueOf(strs[0].charAt(0));
        for (int i = 1; i < strs.length; i++) {
            if (String.valueOf(strs[i].charAt(0)) == common) {
                common += strs[i].charAt(i);
            }
        }
        return common;
    }

    public static void main(String... m) {
        String[] array = { "Hello", "Hell", "Home" };
        System.out.println(longestCommonPrefix(array));
    }
}
