package array;

public class LargestElementSecond {

	public static void main(String[] args) {
		int[] arr = {25,47,69,4,84,57,64,12,35,56};
		System.out.println(Solutions.max1(arr));
	}
}
class Solutions{
	static int max1(int[] arr) {
		for( int i = 0; i<arr.length; i++) {
			boolean flag = true;
			for( int j = 1 ; j<arr.length; j++) {
				if(arr[j]>arr[i]) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				return arr[i];
			}
		}
		return -1;
	}
}
