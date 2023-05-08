package pattern;

import java.util.Scanner;

public class LeftPascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        //code for upper half
        
        for( int i = 1; i<=n; i++) {
            for(int j = i; j<=n; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        //code for lower half
        
        for(int i = 2; i<=n; i++) {
            for(int j = 1 ; j<=i; j++ ) {
                System.out.print("  ");
            }
            for( int j = i; j<=n; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
