package mathematics;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
    static BigInteger fact( int n) {
        BigInteger f = new BigInteger("1");
        for( int i = 2 ; i<=n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
