package collectionFrame;

import java.util.ArrayList;

public class TutorialArrayListOfArrayList {

	public static void main(String[] args) {
		int n ;
		n = 10;
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for( int i = 0; i<n; i++) {
			l1.add(i);
		}
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for(int i = 0; i<5; i++) {
			l2.add(i);
		}
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		for( int i = 0; i<3; i++) {
			l3.add(i);
		}
		ArrayList<ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>();
		m.add(l1);
		m.add(l2);
		m.add(l3);
		for( ArrayList<Integer> i:m) {
           for( int j:i) {
        	   System.out.print(j + " ");
           }
           System.out.println();
		}
	}
}
