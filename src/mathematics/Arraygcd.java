package mathematics;

public class Arraygcd {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int ans = arr[0];
        for( int i = 1; i<arr.length; i++) {
            ans = gcd( ans , arr[i]);
        }
        System.out.println(ans);
    }
    static int gcd( int n , int m) {
        if(m==0) {
            return n; 
        }
        return gcd(m , n%m);
    }
}
