package string;

public class PalindromeAnotherApproach {

	public static void main(String[] args) {
		String str = "abbbbbqa";
		int low = 0; 
		int high = str.length()-1;
		boolean flag = true;
		while(low<high) {
			if((str.charAt(low))!=str.charAt(high)) {
				
				flag = false;
			}
			high--;
			low++;
		}
		if(flag==true) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
		
	}
}
