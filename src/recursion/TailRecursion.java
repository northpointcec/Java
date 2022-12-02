package recursion;

import java.util.Scanner;

public class TailRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tail(n);
        sc.close();
    }
    static void tail(int n) {
        if(n==0) {
            return;
        }
        System.out.print(n + " ");
        tail(n-1);
    }
}
