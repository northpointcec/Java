package mathematics;

import java.util.Scanner;

public class FactorSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(factorsum(n));
    }
    static long factorsum(int N) {
        if (N == 1){
            return 1;
        }
        long result = 0;
        for( int i = 2; i*i<=N; i++){
            if(N%i == 0){
                if(i == N/i){
                    result = result +i;
                }else{
                    result = result +i + N/i;
                }
            }
        }
        return result +N + 1;
    }
}
