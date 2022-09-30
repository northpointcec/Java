package array;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr = {5,7,8,9,1,2,0,22,58,32,4};
	   System.out.println(Solution.max(arr));
	   Solution.print();
	   
	}
}
class Solution{
	static int max(int[] arr) {
		int max = arr[0];
		for( int i = 1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = Math.max(max, arr[i]);
			}
		}
		return max;
	}
	public static void print() {
		System.out.println("Hello World");
	}
}
/*
 * another approach
 * int res = 0;
 * for( int i = 1 ; i<arr.lenght; i++){
 * 
 * if(arr[i]>arr[res])
 * 
 * res = i;
 * return res;
 * 
 * 
 * 
 * 
 * 
 */
