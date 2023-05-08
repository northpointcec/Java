package mathematics;

import java.util.Scanner;

public class GcdNaive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        System.out.println(gcdNaive(n , m));
    }
    static int gcdNaive(int n , int m) {
        int res = Math.min(n, m);
        while(res>0) {
            if(n%res==0 && m%res==0) {
                break;
            }
            res--;
        }
        return res;
            }
}
