import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6);
        list.stream().map(x->x+2).forEach(System.out:: println);

    }
}
