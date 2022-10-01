package arrayList;

import java.util.ArrayList;

public class Arraylist1 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        // ArrayList as two dimensional grow able array
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(40);
        l2.add(50);
        l2.add(60);
        l.add(l1);
        l.add(l2);
        System.out.println(l);
    }
}
