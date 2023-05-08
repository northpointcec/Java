package mathematics;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(count(n));
    }
    static int count(int n) {
        int cou = 0;
        while(n>0) {
            cou++;
             n = n/10;
        }
        return cou;
    }
}
