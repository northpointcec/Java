package hashSet;

import java.util.HashSet;

public class UnionOfArrays {

    public static void main(String[] args) {
        int[] a = {5,15,10,15};
        int[] b = {4,5,10,15};
        System.out.println(union(a , b));
    }
    static int union( int[] a , int[] b) {
        HashSet<Integer> h = new HashSet<>();
         for( int i = 0; i<a.length;i++) {
             h.add(a[i]);
         }
         for( int i = 0; i<b.length;i++) {
             h.add(b[i]);
         }
         return h.size();
    }
}
