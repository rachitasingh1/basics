package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String... s) {

        List<String> cities1 = new ArrayList<>();
        List<String> cities2 = new ArrayList<>();
        List<String> cities3 = new ArrayList<>();
        cities1.add("New Delhi");
        cities1.add("Mathura");

        cities2.add("Mumbai");
        cities2.add("Pune");

        cities3.add("Pune");
        cities3.add("NY");

        Student s1=new Student("Rachita", "12", cities1);
        Student s2=new Student("Rama", "13", cities2);
        Student s3=new Student("Ryan", "14", cities3);

        List<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);

        List<List<String>> citiesList = students.stream().map(student->student.getCities()).collect(Collectors.toList());
        citiesList.stream().forEach(x->System.out.print(x));

        System.out.println();
        List<String> citiesListflattened = students.stream().flatMap(student->student.getCities().stream()).collect(Collectors.toList());
        citiesListflattened.stream().forEach(x->System.out.print(x));

        System.out.println();
        Set<String> citiesSetflattened = students.stream().flatMap(student->student.getCities().stream()).skip(1).limit(3).collect(Collectors.toSet());
        citiesSetflattened.stream().forEach(x->System.out.print(x));
        
    }

}
