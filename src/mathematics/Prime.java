package mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Prime {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        BigInteger b = new BigInteger(s);
        boolean res = b.isProbablePrime(1);
        if(res==true) {
            System.out.println("prime");
        }else {
           System.out.println("not prime");
        }
    }
}
