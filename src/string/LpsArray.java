package string;

public class LpsArray {
	public static void main(String[] args) {
		String str = "abacabad";
		int n = str.length();
		int[] lps = new int[n];
		lps[0] = 0;
		int len = 0;
		int i = 1;
		while (i < n) {
			if (str.charAt(i) == str.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len == 0) {
					lps[i] = 0;
					i++;
				} else {
					len = lps[len - 1];
				}
			}
		}
		for (int a : lps) {
			System.out.print(a + " ");
		}
	}
}
