package bitManipulation;

import java.util.Scanner;
 
public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = (int) (Math.log(n)/Math.log(2) );
        System.out.println(a);
    }
}
