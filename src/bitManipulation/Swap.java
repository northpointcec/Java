package bitManipulation;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Before swap a = "+a+" and b ="+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swap a = "+a+" and b = "+b);
    }
}
