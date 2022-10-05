package mathematics;

import java.util.Scanner;

public class LcmEfficient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        System.out.println(lcm(n , m));
                
    }
    static int lcm( int n , int m ) {
        return (m*n)/gcd(n , m);
    }
    static int gcd( int n , int m) {
        if( m==0) {
            return n;
        }
        return gcd(m , n%m);
    }
}
