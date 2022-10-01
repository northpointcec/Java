package string;

public class Chars1 {

    public static void main(String[] args) {
        String quote = "geeksforgeeks";
        Occur.countFre(quote);
    }
}
class Occur{
    
    static void countFre(String a) {
        int[] count = new int[26];
        for( int i = 0; i<a.length(); i++) {
            count[a.charAt(i)-'a']++;
        }
        for( int i = 0; i<26; i++) {
            if(count[i]>0)
            System.out.println((char)(i+'a') + "  "+ count[i]);
        }
    }
}
