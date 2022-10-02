package bitManipulation;

import java.util.Scanner;

public class GrayToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int binary = n;
        while(n>0) {
           n = n>>1;
           binary = binary^n;
        }
        System.out.println(binary);
    }
}
