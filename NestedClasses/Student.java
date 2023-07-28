public class Student {
    String name;
    int age;
    String stream;
    String address;

    // will be treated as a data member of class Student
    class Marks {
        float math;
        float english;
        float science;
        float computerscience;
    }

    public static void main(String... t) {
        Student s = new Student();
        s.name="hey";

    }

}
