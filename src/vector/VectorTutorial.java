package vector;

import java.util.Vector;

public class VectorTutorial {

    public static void main(String[] args) {
        Vector<Vector<Integer>> v1 = new Vector<Vector<Integer>>();
        Vector<Integer> v = new Vector<Integer>();
        for(int i = 0; i<=10; i++) {
            v.add(i);
        }
        v1.add(v);
        Vector<Integer> b = new Vector<Integer>();
        for( int i = 10; i<21; i++) {
           b.add(i);
        }
        System.out.println(v);
        System.out.println(b);
        System.out.println(v1);
        v1.add(b);
        System.out.println(v1);
    }
}
