package Collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String... s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rachita", 10);
        map.put("Rachita", 11);
        map.put("Rachita", 12);
        map.put("Rachita", 100);

        System.out.println(map.get("Rachita"));
    }
}
