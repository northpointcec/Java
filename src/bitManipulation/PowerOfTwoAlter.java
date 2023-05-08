package bitManipulation;

import java.util.Scanner;

public class PowerOfTwoAlter {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if((n&(n-1)) == 0) {
            System.out.println("power of two");
        }else {
            System.out.println("not power of two");
        }
    }
}
