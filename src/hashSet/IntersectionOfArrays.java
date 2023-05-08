package hashSet;

import java.util.HashSet;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        int[] a = {5,15,10,15};
        int[] b = {1,2};
        System.out.println(intersection(a ,b));
    }
    static int intersection( int[]a , int[]b) {
        HashSet<Integer> h = new HashSet<>();
        for( int i = 0; i<a.length; i++) {
            h.add(a[i]);
        }
        int count = 0;
        for( int i = 0; i<b.length;i++) {
            if(h.contains(b[i])) {
                count++;
                h.remove(b[i]);
            }
        }
        return count;
    }
}
