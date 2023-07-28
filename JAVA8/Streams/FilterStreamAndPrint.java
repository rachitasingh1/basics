package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStreamAndPrint {
    
    public static void main(String... s){
        
        ArrayList<Integer> somelist = new ArrayList<>();
        somelist.add(5);
        somelist.add(10);
        somelist.add(15);
        somelist.add(20);
        somelist.add(20);
        // somelist.add(25);
        // somelist.add(30);
        // somelist.add(34);
        // somelist.add(80);
        // somelist.add(1);

        // List<Integer> filteredlist=somelist.stream().filter(x->x%5==0).collect(Collectors.toList());
        // filteredlist.stream().forEach(x-> System.out.println(x));

        // Integer max= somelist.stream().mapToInt(x->x).min().orElseThrow(NoSuchElementException::new);
        // System.out.println(max);

        // long count= somelist.stream().count();
        // System.out.println(count);
       somelist.stream().distinct().collect(Collectors.toList()).forEach(x->System.out.println(x));

    }
}
