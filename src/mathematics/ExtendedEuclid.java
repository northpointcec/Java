package mathematics;

import java.util.Scanner;

public class ExtendedEuclid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        System.out.println(gcd(m ,n));
    }
    static int gcd( int n , int m) {
        if(m == 0) {
            return n;
        }
        return gcd(m , n%m);
    }
}
