package string;

public class Palindrome {

	public static void main(String[] args) {
		String s = "aaao";
		char[] temp = new char[s.length()];
		for( int i = 0; i<s.length(); i++) {
			temp[i] =s.charAt((s.length()-1-i));
		}
		String str = String.valueOf(temp);
		if(s.equals(str)) {
			System.out.println("Anagram");
		}else {
			System.out.println("not Anagram");
		}
	}
}
