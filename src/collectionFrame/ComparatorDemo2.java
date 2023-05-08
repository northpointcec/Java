package collectionFrame;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo2 {

    public static void main(String...args) {
        TreeSet<Integer> t = new TreeSet<>( new myComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(5);
        t.add(20);
        System.out.println(t);
    }
}
class myComparator implements Comparator<Object>{
    public int compare(Object obj1 , Object obj2) {
        Integer a = (Integer)obj1;
        Integer b = (Integer)obj2;
        if(a>b) {
            return -1;
        }else if(a<b) {
            return +1;
        }else {
            return 0;
        }
    }
}