import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorListITerator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("I love");
        al.add("reading");
        al.add("classics");
        al.add("always");
        

        ListIterator<String> lit = al.listIterator();
        // while (lit.hasNext()) {
        //     System.out.println(lit.next());
        // }
        lit.next();
        lit.next();
        lit.next();

        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }

        lit.set("hey");
        System.out.println(al);

    }
}
