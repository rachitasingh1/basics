import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortInAscending {
    public static void main(String[] args) {
        // int somearray[] = { 3, 5, 1, 7, 9, 4 };
        // int result[] = sortArray(somearray);

        // for (int num : result) {
        //     System.out.println(num);
        // }

        //sort in ascending
        List<Integer> list = Arrays.asList(8,3,4,1,6,4,66,7,0,5);
        list.stream().sorted().forEach(System.out::println);

        // sort in descending order
        list.stream().sorted((o1,o2)->o2.compareTo(o1)).forEach(System.out::println);
    }
    // public static int[] sortArray(int[] nums) {
    //     Arrays.sort(nums);   
    //     return nums;
    // }
}