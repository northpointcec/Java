package mathematics;

import java.util.Scanner;

public class ComputingPower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        System.out.println(pow(n, m));
    }
    static int pow(int n, int m) {
        if(m ==0) {
            return 1;
        }
        int temp = pow(n, m/2);
        if((m%2)==0) {
            return temp*temp;
        }else {
            return temp*temp*n;
        }
    }
}
