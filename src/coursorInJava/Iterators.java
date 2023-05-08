package coursorInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for( int i = 0; i<11; i++) {
            a.add(i);
            
        }
        System.out.println(a);
        Iterator<Integer> itr = a.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+"  ");
            itr.remove();
        }
        System.out.println();
        System.out.println(a);
        System.err.println("it is a universal coursor for colections");
        System.out.println(itr.getClass().getCanonicalName());
        System.out.println(itr.getClass().getPackageName());
        System.out.println(itr.getClass());
        System.out.println(itr.getClass().getModifiers());
        System.out.println(itr.getClass().getTypeName());
     }
}
