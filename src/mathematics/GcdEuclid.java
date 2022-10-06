package mathematics;

import java.util.Scanner;

public class GcdEuclid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        System.out.println(gcdEuclid(n , m));
    }
    static int gcdEuclid( int n , int m) {
        while(n!=m) {
            if(n>m) {
                n = n-m;
            }else {
                m = m -n;
            }
        }
        return n;
    }
}
