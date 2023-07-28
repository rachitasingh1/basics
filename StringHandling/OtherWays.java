public class OtherWays {
    public static void main(String... m) {
        // use StringBuffer when the object is to be changed frequently
        StringBuffer sb = new StringBuffer("Rachita");
        StringBuffer sb1 = new StringBuffer();
        // sb.append(" Singh");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        System.out.println(sb1.capacity());
        // stringBuffer uses the equals() method of the object class as is without
        // overriding it
        System.out.println(sb.equals(sb1));
        sb.insert(3, "xxx");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.substring(2,6));
        System.out.println(sb.subSequence(2,5));
        sb.ensureCapacity(30);
        System.out.println(sb.capacity());

    }
}
