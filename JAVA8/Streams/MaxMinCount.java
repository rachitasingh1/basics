package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class MaxMinCount {
    public static void main(String[] args) throws Exception{
        List<Integer> somelist= Arrays.asList(12,34,55, 1, 67, 80, 81, 99, 22, 21, 39);

        // Long count;
        // Integer max;
        // Integer min;

        // count=somelist.stream().mapToInt(x->x).count();
        // max=somelist.stream().mapToInt(x->x).max().orElseThrow(NoSuchFieldException::new);
        // min = somelist.stream().mapToInt(x->x).min().orElseThrow(NoSuchElementException::new);

        // System.out.println("Count: "+count);
        // System.out.println("Max: "+max);
        // System.out.println("Min: "+min);

        List<Integer> evennums= somelist.stream().filter(x->x%2==0).collect(Collectors.toList());
        evennums.stream().forEach(x->System.out.println(x));

        Double average= somelist.stream().mapToInt(x->x).average().orElseThrow(NoSuchElementException::new);
        System.out.println(average);
    }
}
