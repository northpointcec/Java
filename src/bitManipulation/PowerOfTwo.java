package bitManipulation;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0; 
        while(n>0) {
            count++;
            n = n&(n-1);
        }
        if(count==1) {
            System.out.println("Provided no is power of two");
        }else {
            System.out.println("No is not power of two");
        }
    }
}
