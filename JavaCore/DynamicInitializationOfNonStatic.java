// program to show 
// dynamic initialization of non static data members
// using the Parameterized constructor

public class DynamicInitializationOfNonStatic {
    String name;
    boolean student;

    DynamicInitializationOfNonStatic(String name, boolean student) {
        this.name = name;
        this.student = student;
    }

    public static void main(String... s) {
        DynamicInitializationOfNonStatic dynamic1 = new DynamicInitializationOfNonStatic("Olive", true);
        System.out.println("Name 1 is :"+dynamic1.name);
        DynamicInitializationOfNonStatic dynamic2 = new DynamicInitializationOfNonStatic("Lily", false);
        System.out.println("Name 2 is :"+dynamic2.name);

    }
}
