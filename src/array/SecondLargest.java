package array;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {5,7,8,9,1,2,0,22,58,32,4};
		System.out.println(Sec.larg(arr));
	}
}
class Sec {
	static int larg(int[] arr) {
		int n = Solution.max(arr);
		int res = -1;
		int i;
		for( i = 0; i<arr.length; i++) {
			if(arr[i]!=n) {
				if(res==-1) {
					res=i;
				}else if(arr[i]>arr[res]) {
					res = i;
				}
			}
		}
		return arr[res];
	}
}
