public class DataTypesDefaultValues {
    static boolean flag;
    byte databyte;
    short datashort;
    int dataint;
    long datalong;
    float datafloat;
    static double datadouble;
    static char datachar;
    static String datastr;
    static int staticint;

    public static void main(String... d) {
        DataTypesDefaultValues data = new DataTypesDefaultValues();
        System.out.println("boolean: " + flag);
        System.out.println("byte: " + data.databyte);
        System.out.println("short: " + data.datashort);
        System.out.println("int: " + data.dataint);
        System.out.println("long: " + data.datalong);
        System.out.println("float: " + data.datafloat);
        System.out.println("double: " + datadouble);
        System.out.println("char: " + datachar);
        System.out.println("String: " + datastr);
        System.out.println("static int: "+ staticint);
    }

}
