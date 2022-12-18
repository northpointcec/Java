package recursion;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        bin(n);
    }
    static void bin(int n) {
        if(n == 1 || n == 0) {
            System.out.print(n);
            return;
        }
        bin(n/2);
        System.out.print(n%2);
    }
}
