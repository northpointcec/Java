package recursion;

import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hexadecimal(n);
        sc.close();
    }
    static void hexadecimal(int n) {
        
        int k = n;
        if(n%16 == k) {
            int a = n%16;
            if(a<10) {
                System.out.print(a);
            }else {
                switch(a) {
                    case 10:
                        System.out.print("A");
                        break;
                    case 11:
                        System.out.print("B");
                        break;
                    case 12:
                        System.out.print("C");
                        break;
                    case 13:
                        System.out.print("D");
                        break;
                    case 14:
                        System.out.print("E");
                        break;
                    case 15:
                        System.out.print("F");
                        break;
                }
            }
            return;
        }
        hexadecimal(n/16);
        int a = n%16;
       if(a<10) {
           System.out.print(a);
       }else {
           switch(a) {
               case 10:
                   System.out.print("A");
                   break;
               case 11:
                   System.out.print("B");
                   break;
               case 12:
                   System.out.print("C");
                   break;
               case 13:
                   System.out.print("D");
                   break;
               case 14:
                   System.out.print("E");
                   break;
               case 15:
                   System.out.print("F");
                   break;
           }
       }
        
    }
}
