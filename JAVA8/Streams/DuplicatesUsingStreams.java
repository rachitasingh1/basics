package Streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicatesUsingStreams {
    public static void main(String[] args) {
        Integer []somearray= {10,28,87,10,20,76,28,80,80};
        List<Integer> list = Arrays.asList(somearray);

        // Set<Integer> set=list.stream().collect(Collectors.toSet());
        // set.stream().forEach(x->System.out.println(x));

        Set<Integer> finalset = new HashSet<>();
        list.stream().filter(x->!finalset.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
        
        // HashSet<Employee> set = new HashSet<>();
        // set=employeelist.stream().filter(e->!set.add(e)).collect(Collectors.toSet());
        // set.forEach(s->System.out.println(s));
    }
}
