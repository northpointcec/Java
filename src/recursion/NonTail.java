package recursion;

import java.util.Scanner;

public class NonTail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nontail(n);
        sc.close();
    }
    static void nontail(int n) {
        if( n == 0) {
            return;
        }
        nontail(n-1);
        System.out.print(n + " ");
    }
}
