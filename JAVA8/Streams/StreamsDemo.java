import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String... s){
       
        ArrayList<Integer> somelist = new ArrayList<>();
        somelist.add(5);
        somelist.add(10);
        somelist.add(15);
        somelist.add(20);
        somelist.add(21);
        somelist.add(25);
        somelist.add(30);
        somelist.add(34);
        somelist.add(40);
        somelist.add(1);

        List<Integer> filteredlist=somelist.stream().filter(x->x%5==0).collect(Collectors.toList());
        filteredlist.stream().forEach(x-> System.out.println(x));

        
        
    }
}
