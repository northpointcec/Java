package bitManipulation;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if((n&1)!=0) {
            System.out.println("odd");
        }else {
            System.out.println("even");
        }
    }
}
