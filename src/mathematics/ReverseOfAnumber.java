package mathematics;

import java.util.Scanner;

public class ReverseOfAnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(rev(n));
    }
    static int rev( int n) {
        int sum = 0;
        while(n>0) {
            sum = sum *10 + n%10;
             n = n/10;
        }
        return sum;
    }
}
