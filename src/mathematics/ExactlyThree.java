package mathematics;

import java.util.Scanner;

public class ExactlyThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        for(int i = 2; i*i<=n; i++) {
            if( isprime(i) == true) {
               
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean isprime(int n) {
        
        for( int i = 2 ; i*i<=n ; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
