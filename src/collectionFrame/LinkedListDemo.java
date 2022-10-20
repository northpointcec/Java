package collectionFrame;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        for( int i = 0; i<=10; i++) {
            l.add(i);
        }
        System.out.println(l);
        Iterator<Integer> j = l.iterator();
       while(j.hasNext()) {
           System.out.print(j.next()+" ");
       }
       l.add(0, null);
       System.out.println();
       
       System.out.println(l);
       LinkedList<Integer> l1 = new LinkedList<Integer>();
       for( int i = 11; i<21; i++) {
           l1.add(i);
       }
       System.out.println(l1);
       l1.addAll(l);
       System.out.println(l1);
       l1.retainAll(l);
       System.out.println(l1);
    }
}
