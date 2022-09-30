package array;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = d%arr.length;
		if(d<10) {
			while(d-->0) {
				int n = arr[0];
				for( int i = 0; i<arr.length-1;i++) {
					
					arr[i] = arr[i+1];
					
				}
				arr[arr.length-1] = n;
				
			}
		}else {
			while(m-->0) {
				int n = arr[0];
				for( int i = 0; i<arr.length-1;i++) {
					
					arr[i] = arr[i+1];
					
				}
				arr[arr.length-1] = n;
				
			}
		}
		
		
		
		for( int i:arr) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
