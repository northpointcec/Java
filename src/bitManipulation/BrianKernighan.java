package bitManipulation;

import java.util.Scanner;

public class BrianKernighan {

    public static void main(String[] args) {
        
       //efficient way to count set bits
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        while(n>0) {
            count++;;
            n = n&(n-1);
        }
        System.out.println(count);
    }
}
