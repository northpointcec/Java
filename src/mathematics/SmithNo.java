package mathematics;

import java.util.Scanner;

public class SmithNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = n;
        int sum  = 0;
        while(d>0) {
            sum = sum +d%10;
            d = d/10;
        }
        
        sc.close();
        boolean b = isprime(n);
        if(b == true) {
            System.out.println("not a smith no");
            System.exit(0);
        }
        int a = primefactor(n);
        if(a == sum) {
            System.out.println("smit no");
        }else {
            System.out.println("not a smith no");
        }
    }
    static boolean isprime(int n) {
        if(n==1) {
            return false;
        }
        if(n==2 || n==3) {
            return true;
        }
        if(n%2==0 || n%3==0) {
            return false;
        }
        for( int i = 5; i*i<=n; i= i+6) {
            if(n%i==0 || n%(i+2)==0) {
                return false;
            }
        }
        return true;
    }
    static int primefactor( int n) {
        int c  = 2;
        int sum = 0;
        while(n>1) {
            if(n%c==0) {
                int a = c;
                while(a>0) {
                    sum = sum+a%10;
                    a = a/10;
                }
                n = n/c;
            }else {
                c++;
            }
        }
        
        return sum;
    }
}
