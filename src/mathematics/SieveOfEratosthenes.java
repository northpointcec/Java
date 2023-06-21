package mathematics;

public class SieveOfEratosthenes {
	public static void main(String[] args) {
		int n = 100;
		int[] prime = new int[n];
		for (int i = 2; i < n; i++) {
			prime[i] = 1;
		}
		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == 1) {
				for (int j = i * i; j < n; j = j + i) {
					prime[j] = 0;
				}
			}
		}

		for (int i = 2; i < n; i++) {
			if (prime[i] == 1) {
				prime[i] = i;

			}
		}

		for (int i = 2; i < n; i++) {
			System.out.print(prime[i] + "  ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
}
