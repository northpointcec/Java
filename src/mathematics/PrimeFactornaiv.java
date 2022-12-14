package mathematics;

import java.util.Scanner;

public class PrimeFactornaiv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        prime(n);
    }
    static void prime(int n ) {
        while(n%2==0) {
            System.out.println(2);
            n = n/2;
        }
        for( int i = 3 ; i<=Math.sqrt(n); i+=2) {
            while(n%i==0) {
                System.out.println(i);
                n = n/i;
            }
        }
        if(n>2) {
            System.out.println(n);
        }
    }
}
// time complexity is square root of input