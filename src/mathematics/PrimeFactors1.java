package mathematics;

import java.util.Scanner;

public class PrimeFactors1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 2; i*i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
		if(n>=2) {
			System.out.println(n);
		}
		scanner.close();
	}
}
