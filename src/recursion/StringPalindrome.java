package recursion;

public class StringPalindrome {

    public static void main(String[] args) {
        String str = "Ram";
        int s = 0; 
        int e = str.length()-1;
        System.out.println(palin(str, s, e));
                
    }
    static boolean palin(String str , int s, int e) {
        if(s == e) {
            return true;
        }
        if(str.charAt(s) != str.charAt(e)) {
            return false;
        }
        if(s<e) {
            return palin(str, s+1, e-1);
        }
        return true;
    }
}
