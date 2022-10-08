package coursorInJava;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterators {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        for( int i = 0; i<11; i++) {
            l.add(i);
        }
        System.out.println(l);
        ListIterator<Integer> litr = l.listIterator();
        while(litr.hasNext()) {
            System.out.print(litr.next()+"  ");
        }
    }
}
