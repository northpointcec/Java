package mathematics;

import java.util.Scanner;

public class GoldbachConjecture {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(isSumOfTwo(n));
		scanner.close();
	}

	static String isSumOfTwo(int N) {
		if (isPossible(N))
			return "Yes";
		else
			return "No";
	}

	static boolean isPossible(int N) {
		if (N < 4)
			return false;
		if (N % 2 == 0)
			return true;
		return isPrime(N - 2);
	}

	static boolean isPrime(int x) {
		for (int i = 2; i * i <= x; i++)
			if (x % i == 0)
				return false;
		return true;
	}
}
