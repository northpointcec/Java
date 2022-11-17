package bitManipulation;

import java.util.Scanner;
 
public class Countsetbit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = (int) (Math.log(n)/Math.log(2) + 1);
        System.out.println(a);
    }
}
