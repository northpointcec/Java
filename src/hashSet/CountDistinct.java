package hashSet;

import java.util.HashSet;

public class CountDistinct {

    public static void main(String[] args) {
      
        int[] arr  = {1,4,7,8,5,2,3,6,9,8,7,4,5,8,4,2,5,6,2,4,5,6,6};
        System.out.println(count(arr));
    }
    static int count(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        for( int i = 0; i<arr.length;i++) {
            h.add(arr[i]);
        }
        System.out.println(h);
        return h.size();
       
       }
}
