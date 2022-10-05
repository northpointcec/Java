package mathematics;

import java.util.Scanner;

public class LcmNaive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        System.out.println(lcmNaive(n , m));
    }
    static int lcmNaive(int n  , int m) {
        int res = Math.max(n, m);
        while(true) {
            if(res%n ==0 &&res%m==0) {
                break;
            }
            res++;
        }
        return res;
    }
}
