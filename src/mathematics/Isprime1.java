package mathematics;

import java.util.Scanner;

public class Isprime1 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isprime1(n));
    }
    static boolean isprime1(int n) {
        if(n==1) {
            return false;
           
        }
        for( int i = 2; i<n; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
