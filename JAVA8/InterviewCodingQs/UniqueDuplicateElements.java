package InterviewCodingQs;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 28, 87, 10, 20, 76, 28, 80, 80, 80, 80);
        HashSet<Integer> set = new HashSet<>();
        list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
    }
}
