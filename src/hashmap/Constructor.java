package hashmap;

import java.util.HashMap;

public class Constructor {

    public static void main(String[] args) {
        //default initial capacity 16 and load factor .75
        HashMap<Integer , Integer> h = new HashMap<>();
        h.put(5, 5);
        // Initialized capacity and default load factor .75
        HashMap<Integer , Integer> n = new HashMap<>(20);
        n.put(5, 5);
        HashMap<Integer , Integer> m = new HashMap<>(20);
        m.put(4, 4);
        System.out.println(h);
        System.out.println(n);
        System.out.println(m);
    }
}
