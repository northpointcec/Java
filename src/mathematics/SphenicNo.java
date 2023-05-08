package mathematics;

import java.util.Scanner;

public class SphenicNo {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[8];
        int count =0;
        
        for( int i = 1 ; i<=n; i++) {
            if(n%i==0) {
                
                count++;
            }
        }
        if(count<8 || count>8) {
            
            System.out.println("no");
            System.exit(0);
        }
        count = 0;
        for( int i = 1 ; i<=n; i++) {
            if(n%i==0) {
                arr[count] = i;
                count++;
            }
        }
        for( int i:arr) {
            System.out.print(i +" " );
        }
    
        int add = 0;
        for( int i =0; i<8; i++) {
            if(isprime(arr[i])) {
                add++;
            }
        }
        if(add>=3) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        sc.close();
    }
    static boolean isprime( int n) {
        if(n==1) {
            return false;
        }
        if(n==2 || n ==3) {
            return true;
        }
        if(n%2==0 || n%3==0) {
            return false;
        }
        for( int i = 5; i*i<=n; i = i+6) {
            if(n%i==0 || n%(i+2)==0) {
                return false;
            }
        }
        return true;
    }
}
