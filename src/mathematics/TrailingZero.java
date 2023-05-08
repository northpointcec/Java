package mathematics;

import java.util.Scanner;

public class TrailingZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(trail(n));
    }
    static int trail(int n) {
        int count = 0;
        for(int i = 5; n/i>=1; i = i*5) {
            count = count+ n/i;
        }
        return count;
    }
}
