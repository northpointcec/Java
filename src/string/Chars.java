package string;

public class Chars {

    public static void main (String[] args) {
        String quote = "If you don't sacrifice for what you want,what you want become the sacrifice";
        
       Count.chars(quote); 
    }
}
class Count{
    static void chars(String a) {
     int[] count = new int[128];
     for( int i = 0; i<a.length();i++) {
         count[a.charAt(i)]++;
     }
     for( int i:count) {
         System.out.println(i);
     }
    }
}
