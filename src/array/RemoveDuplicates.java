package array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {10,20,20,30,30,30};
		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		for( int i = 1; i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				temp[i] = arr[i];
			}
		}
		for( int I:temp) {
			System.out.println(I);
		}
	}
}
