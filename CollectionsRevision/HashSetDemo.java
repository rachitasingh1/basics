import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(130);
        set.add(95);
        set.add(93);
        set.add(100);
        set.add(null);
        set.add(null);
        // ArrayList list = new ArrayList();
        // list.add(90);
        System.out.println(set);
        Iterator it =set.iterator();
        // it.remove();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
