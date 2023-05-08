package bitManipulation;

import java.util.Scanner;

public class BinaryToGray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int gray = n^(n>>1);
        System.out.println(gray);
    }
}
