class FirstString {
    public static void main(String... s) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3 == s4);
        System.out.println(s3 == s1);
        System.out.println(s1.intern());
        System.out.println(s1.concat(" There."));
        
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        s1 = null;
        System.out.println(s1);

    }
}
