package collectionFrame;

import java.util.ArrayList;
import java.util.List;

public class List1 {

    public static void main(String[] args) {
        List<List<Object>> l = new ArrayList<>();
        List<Object>L1 = new ArrayList<>();
        for( int i = 0; i<5;i++) {
           L1.add(i);
        }
        List<Object> s = new ArrayList<>();
        s.add("Ajay");
        s.add("RAj");
        l.add(L1);
        l.add(s);
        for(List<Object> i:l) {
            System.out.println(i.size());
            System.out.println(i);
        }
        for(List<Object> i:l) {
           for(Object j:i) {
               System.out.print(j+" ");
           }
           System.out.println();
        }
        
    }
}
