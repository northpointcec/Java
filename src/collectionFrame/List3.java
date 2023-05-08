package collectionFrame;

import java.util.ArrayList;
import java.util.List;

public class List3 {

    public static void main(String[] args) {
        List<List<List<Object>>> o = new ArrayList<List<List<Object>>>();
        List<List<Object>> a = new ArrayList<List<Object>>();
        List<List<Object>> b = new ArrayList<List<Object>>();
        List<Object> i = new ArrayList<>();
        for(int ii = 0; ii<5; ii++) {
            i.add(ii);
        }
        List<Object> s = new ArrayList<>();
        s.add("Ajay");
        s.add("Raj");
        a.add(i);
        a.add(s);
        b.add(s);
        b.add(i);
        o.add(a);
        o.add(b);
        for(List<List<Object>> r:o) {
            for(List<Object> e:r) {
                for(Object w:e) {
                    System.out.print(w +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(o);
    }
}
