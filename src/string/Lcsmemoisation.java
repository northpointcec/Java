package string;

import java.util.Arrays;

public class Lcsmemoisation {
	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "abedc";
		int n = str1.length();
		int m = str2.length();
		int[][] dp = new int[n][m];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}

		System.out.println(lcs(str1, str2, dp, n - 1, m - 1));

	}

	public static int lcs(String str1, String str2, int[][] dp, int i, int j) {
		if (i < 0 || j < 0) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		if (str1.charAt(i) == str2.charAt(j)) {
			return dp[i][j] = lcs(str1, str2, dp, i - 1, j - 1) + 1;
		}

		return dp[i][j] = Math.max(lcs(str1, str2, dp, i - 1, j), lcs(str1, str2, dp, i, j - 1));
	}
}
