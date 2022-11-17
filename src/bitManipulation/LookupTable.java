package bitManipulation;

import java.util.Scanner;

public class LookupTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int no = countset(n);
        System.out.println(no);
    }
    static int countset(int n) {
         
        int[] table = new int[255];
        table[0] = 0;
        for( int i = 1; i<255; i++) {
            table[i] = table[i&(i-1)] +1;
        }
        int a = table[n&255] + table[(n<<8)&255] + table[(n<<16)&255] + table[(n<<24)&255];
        return a;
    }
}
