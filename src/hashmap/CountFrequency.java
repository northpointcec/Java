package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

    public static void main(String[] args) {
        int[] arr = {50,50,10,10,40};
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for( int a:arr) {
            h.put(a, h.getOrDefault(a, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e:h.entrySet()) {
            System.out.println(e.getKey() + " "+ e.getValue());
        }
        
    }
}
