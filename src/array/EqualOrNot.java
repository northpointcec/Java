package array;

import java.util.Arrays;

public class EqualOrNot {

	public static void main(String[] args) {
		int A[] = {1,2,5,4,0};
		int B[] = {2,4,5,0,1};
		Arrays.sort(A);
		Arrays.sort(B);
		if(Arrays.equals(A, B)) {
			System.out.println("Yes they are equal");
		}else {
			System.out.println("no they are not equal");
		}
	}
}
