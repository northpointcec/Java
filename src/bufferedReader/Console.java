package bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] srt = br.readLine().split(" ");
	
		int[] a = new int[n];
		for( int i = 0 ; i<n; i++) {
			a[i] = Integer.parseInt(srt[i]);
		}
		for( int i:a) {
			System.out.print(i+" ");
		}
	}
}
