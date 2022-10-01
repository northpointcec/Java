package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {

    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        
       System.out.println(Ana.isAnagram(s, t));
    }
}
class Ana{
    final static int max = 256;
    static boolean isAnagram(String a , String b) {
        if(a.length() != b.length()) {
            return false;
        }
        int[] count= new int[max];
        for( int i = 0; i<a.length(); i++) {
            count[a.charAt(i)]++;
            count[a.charAt(i)]--;
        }
        for( int i = 0; i<max; i++) {
            if(count[i]!=0) {
                return false;
            }
        }
        return true;
    }
}