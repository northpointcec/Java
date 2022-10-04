package hashSet;

import java.util.HashSet;

public class CountDistinct {

    public static void main(String[] args) {
      
        int[] arr  = {1,1,2,2,3,3,4,5,6,7};
        System.out.println(count(arr));
    }
    static int count(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        for( int i = 0; i<arr.length;i++) {
            h.add(arr[i]);
        }
      
        return h.size();
       
       }
}
