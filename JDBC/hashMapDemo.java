import java.util.HashMap;

public class hashMapDemo {
    public static void main(String... s){
        Student s1= new Student("Rachita", 10);
        
        HashMap<Student, Integer> map= new HashMap<>();
        // map.put(s1, 100);
        // // map.put(100, s1);
        // System.out.println(map.get(s1));

        map.put(new Student("Something", 12), 100);
        System.out.println(map.get(new Student("Something", 12)));
    }
}
