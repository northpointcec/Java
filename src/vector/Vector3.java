package vector;

import java.util.Vector;

public class Vector3 {

    public static void main(String[] args) {
        Vector<Vector<Vector<Integer>>> v = new Vector<Vector<Vector<Integer>>>();
        Vector<Vector<Integer>> a = new Vector<Vector<Integer>>();
        Vector<Integer> aa = new Vector<Integer>();
        for( int i =1; i<=10;i++) {
            aa.add(i);
        }
        a.add(aa);
        v.add(a);
        System.out.println(v);
        int[][][] arr = (int[][][]) v.toArray();
        for( int[][] i:arr) {
            for( int [] k: i) {
                for( int j:k) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
       
    }
    
}
