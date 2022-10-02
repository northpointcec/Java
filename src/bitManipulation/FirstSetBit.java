package bitManipulation;

import java.util.Scanner;

public class FirstSetBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int pos = 1;
        int count = 0;
        while(n>0) {
            count++;
         if((n&pos)==1) {
            
             break;
         }
        }
        System.out.println(count);
    }
}
