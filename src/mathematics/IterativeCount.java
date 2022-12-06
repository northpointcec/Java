package mathematics;

import java.util.Scanner;

public class IterativeCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = 1;
        sc.close();
        while(m>0) {
            if((m&1) == 1) {
                res = res*n;
            }
            m = m>>1;
            n = n*n;
        }
        System.out.println(res);
    }
}
