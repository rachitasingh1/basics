import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("101");
        al.add("102");
        al.add("103");
        al.add("104");
        al.add("105");
        al.add("106");

        System.out.println(al);

        // ArrayList<String> al2 = new ArrayList<>();
        // al2.add("rach");
        // al2.add("ita");
        // al2.add("sin");
        // al2.add("gh");
        // System.out.println(al2);
        // al.remove("104");
        // al.remove(3);
        // System.out.println(al);
        // al.addAll(al2);
        // System.out.println(al);
        // ArrayList<Integer> al3 = new ArrayList<>();
        // al3.add(9);
        // al3.add(10);
        // al3.add(11);

        // Iterator it = al.iterator();
        // it.remove();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // ListIterator lit = al.listIterator();
        // while (lit.hasNext()) {
        //     System.out.println(lit.next());
        // }
    }
}
