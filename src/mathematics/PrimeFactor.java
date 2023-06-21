package mathematics;

import java.util.Scanner;

public class PrimeFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        prime(n);
    }
    static void prime(int n) {
     int c = 2;
     while(n>1) {
         if(n%c==0) {
             System.out.print(c + " ");
             n = n/c;
         }else {
             c++;
         }
     }
    }
}
