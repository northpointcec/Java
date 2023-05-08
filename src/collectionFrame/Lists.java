package collectionFrame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;



public class Lists {

   public static void main(String[] args) {
       List<Integer>  l = new ArrayList<>();
       for( int i = 0; i<=5; i++) {
           l.add(i);
           
       }
       Iterator<Integer> it = l.iterator();
       
       while(it.hasNext()) {
           System.out.print(it.next()+ " ");
       }
       System.out.println();
       for(Object o :l) {
           System.out.print(o+" ");
       }
     Enumeration<Integer> en = new Vector<Integer>(l).elements();
     System.out.println();
     while(en.hasMoreElements()) {
         System.out.print(en.nextElement()+" ");
     }
     en = Collections.enumeration(l);
     System.out.println();
     while(en.hasMoreElements()) {
         System.out.print(en.nextElement()+" ");
     }
   }
}
