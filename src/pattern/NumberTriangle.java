package pattern;

import java.util.Scanner;

public class NumberTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        sc.close();
        for( int i = 0; i<=n; i++) {
            int icj = 1;
            for( int j =0; j<=i; j++) {
                System.out.print(icj+"  ");
                int icjp1 = icj*(i-j)/(j+1);
                icj = icjp1;
            }
            System.out.println();
            
        }
    }
}
