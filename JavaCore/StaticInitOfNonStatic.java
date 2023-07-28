// program to show 
// static initialization of non static data members
// using the Default constructor

public class StaticInitOfNonStatic {

    String name;
    boolean married;
    double salary;
    char caste;
    byte age;

    StaticInitOfNonStatic() {
        name = "Pacman";
        married= false;
        salary=10000d;
        caste='B';
        age=21;
    }

    public static void main(String... t) {
        StaticInitOfNonStatic stat = new StaticInitOfNonStatic();
        System.out.println("Name is : " + stat.name);
        System.out.println("Marrital status is : " + stat.married);
        System.out.println("Caste is : " + stat.caste);
        System.out.println("Age is : " + stat.age);
        System.out.println("Salary is : " + stat.salary);

        StaticInitOfNonStatic stat2 = new StaticInitOfNonStatic();
        System.out.println("Name in stat2 is : " + stat2.name);

    }
}
