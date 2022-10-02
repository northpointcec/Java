package pattern;

import java.util.Scanner;

public class TrianglePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fir = n+2;
       
        sc.close();
        for( int i = 1; i<=n; i++) {
            for( int j = i; j<=n; j++) {
                System.out.print("");
            }
            for( int j = 2; j<=2*n; j++) {
                if(fir==(i+j) ||n==(j-i) ) {
                    System.out.print("*");
                }else if(i==n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
