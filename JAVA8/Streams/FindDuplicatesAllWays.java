package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesAllWays {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(5);

        System.out.print("Initial Items");
        list.stream().forEach(x->System.out.print(" "+x));
        System.out.println();
        Set<Integer> uniques=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();

        System.out.print("Unique  Items");
        list.stream().filter(x->uniques.add(x)).collect(Collectors.toSet()).forEach(x->System.out.print(" "+x));
        System.out.println();
        System.out.print("DistinctItems");
        list.stream().distinct().forEach(x->System.out.print(" "+x));
        System.out.println();
        System.out.print("UsingFreq.   ");
        list.stream().filter(x->Collections.frequency(list,x)>1).collect(Collectors.toSet()).forEach(x->System.out.print(" "+x));
        System.out.println();
        System.out.print("Duplicates   ");
        list.stream().filter(y->!duplicates.add(y)).collect(Collectors.toSet()).forEach(z->System.out.print(" "+z));
        // list.stream().filter(x->!finalset.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));

    }
}
