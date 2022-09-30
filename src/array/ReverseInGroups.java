package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseInGroups {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for( int i = 0; i<10; i++) {
			l.add(i);
		}
		
		Object[] o = l.toArray();
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		rev(o , k);
		sc.close();
		for(Object a: o) {
			System.out.print(a + " ");
		}
	}
	public static void rev(Object[] a , int s) {
	
		grev(a , 0 , s-1);
		grev(a , s, a.length-1);
	}
	public static void grev(Object[] a , int d  , int n) {
		int low = d; 
		int high = n;
		while(low<=high) {
			Object temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
	}
}
