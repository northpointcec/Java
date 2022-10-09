package collectionFrame;

import java.util.TreeSet;

public class ComparatorDemo {

    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        //default natural sorting order that is ascending order
        t.add(10);
        t.add(0);
        t.add(5);
        t.add(15);
        System.out.println(t);
    }
}
