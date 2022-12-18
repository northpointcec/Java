package recursion;

import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        octal(n);
        sc.close();
    }
    static void octal(int n) {
        int k = n;
        if(n%8 ==k) {
            System.out.print(n);
            return;
        }
        octal(n/8);
        System.out.print(n%8);
    }
}
