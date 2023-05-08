package recursion;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int m =  mul(a,b);
        System.out.println(m);
    }
    static int mul(int a, int b) {
        if(b == 1) {
            return a;
        }
        return a+mul(a,b-1);
    }
}
