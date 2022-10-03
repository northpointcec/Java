package mathematics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumbersInAdigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(digit(n));
    }
    static ArrayList<Integer> digit( int n){
        ArrayList<Integer> l = new ArrayList<>();
        while(n>0) {
           
            l.add(n%10);
            n = n/10;
        }
               Collections.reverse(l);
               return l;
    }
}
