import java.util.Arrays;

public class KthLargetElement {
    public static void main(String[] args) {
        int []input = {3,2,1,5,6,4};
        System.out.println(kthlargest(input, 2));
    }

    public static int kthlargest(int []input, int k){
        int kthlargest =0;

        Arrays.stream(input).sorted((a,b)-> b.compareTo(a)).forEach(System.out:: println);

        return kthlargest;
    }

}
