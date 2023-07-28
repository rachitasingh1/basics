package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

//Agenda: Given a list, return the elements greater than 15
public class BasicStreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(45);
        list.add(50);

        List<Integer> result = new ArrayList<>();
        result = list.stream().filter(x -> x>=30).collect(Collectors.toList());
        result.stream().forEach(x->System.out.println(x));


        Stream s = result.stream().filter(x -> x%2==0);
        s.forEach(x->System.out.println(x));
    }
}
