package string;

public class Lexicographical {
	final static int CHAR = 256;
	public static void main(String[] args) {
		String string = "string";
		int mul = factorail(string.length());
		int[] count = new int[CHAR];
		for(int i = 0; i<string.length(); i++) {
			count[string.charAt(i)]++;
		}
		for(int i = 1; i<CHAR; i++) {
			count[i] += count[i-1];
		}
		int res = 1;
		for(int i = 0; i<string.length()-1; i++) {
			mul = mul/(string.length()-i);
			res = res + count[string.charAt(i) -1]*mul;
			for(int j = string.charAt(i); j<CHAR; j++) {
				count[j]--;
			}
		}
		System.out.println(res);
	}

	public static int factorail(int n) {
		int count = 1;
		for (int i = 1; i <=n; i++) {
			count = count * i;
		}
		return count;
	}
}
