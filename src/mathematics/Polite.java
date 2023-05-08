package mathematics;

import java.util.Scanner;

public class Polite {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.close();
       System.out.println(countpolite(n));
    }
    static int countpolite(int n) {
        int result = 1;
        while(n%2==0) {
            n = n/2;
        }
        for( int i =3; i*i<=n; i= i+2) {
            int count = 0; 
            while(n%i==0) {
                n = n/i;
                ++count;
               
            }
            result *=count+1;
        }
        if(n>2) {
            result*= 2;
        }
        return result-1;
    }
   
}
