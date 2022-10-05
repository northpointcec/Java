package mathematics;

import java.util.Scanner;

public class CountFormula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.close();
        System.out.println((int)Math.log10(n)+1);
    }
}
