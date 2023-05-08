package collectionFrame;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemoe4 {

    public static void main(String...args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        // without any constructor means default natural sorting order that is Ascending order
            t.add(10);
            t.add(0);
            t.add(15);
            t.add(20);
            t.add(5);
            t.add(20);
      
            System.out.println(t);
        TreeSet<Integer> t1 = new TreeSet<>(new myComparator2());
        t1.addAll(t);
        System.out.println(t1);
        TreeSet<Integer> t2 = new TreeSet<>(new myComparator3());
        t2.addAll(t);
        System.out.println(t2);
        TreeSet<Integer> t3  = new TreeSet<>(new myComparator4());
        t3.addAll(t);
        System.out.println(t3);
        TreeSet<Integer> t4  = new TreeSet<>(new myComparator5());
        t4.addAll(t);
        System.out.println(t4);
        TreeSet<Integer> t5  = new TreeSet<>(new myComparator6());
            t5.add(10);
            t5.add(0);
            t5.add(15);
            t5.add(20);
            t5.add(5);
            t5.add(20);
        System.out.println(t5);
    }
}
class myComparator2 implements Comparator<Object>{
    public int compare(Object obj1 , Object obj2) {
        Integer a = ( Integer ) obj1;
        Integer b = ( Integer ) obj2;
        return a.compareTo(b);
    }
}
class myComparator3 implements Comparator<Object>{
    public int compare(Object obj1 , Object obj2) {
        Integer a = ( Integer ) obj1;
        Integer b = ( Integer ) obj2;
        return b.compareTo(a);
    }
}
class myComparator4 implements Comparator<Object>{
    public int compare(Object obj1 , Object obj2) {
        Integer a = ( Integer ) obj1;
        Integer b = ( Integer ) obj2;
        return -b.compareTo(a);
    }
}
class myComparator5 implements Comparator<Object>{
    public int compare(Object obj1 , Object obj2) {
        Integer a = ( Integer ) obj1;
        Integer b = ( Integer ) obj2;
        return -a.compareTo(b);
    }
}
class myComparator6 implements Comparator<Object>{
    public int compare(Object obj1 , Object obj2) {
      
        return +1;
    }
}