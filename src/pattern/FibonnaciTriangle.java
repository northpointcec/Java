package pattern;

import java.util.Scanner;

public class FibonnaciTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0; 
        int sum1 = 1;
        for( int i = 1; i<=n; i++) {
            for( int j = 1; j<=i; j++) {
             
                   System.out.print(sum+" ");
                   int tem = sum +sum1;
                   sum = sum1;
                   sum1 = tem;
           
            }
            
            System.out.println();
        }
    }
}
