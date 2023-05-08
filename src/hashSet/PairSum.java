package hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        sc.close();
        int[] arr = {3,2,8,15,-8};
        HashSet<Integer> s = new HashSet<Integer>();
        for( int i = 0; i<arr.length; i++) {
            if(s.contains(sum-arr[i])) {
                System.out.println("true");
                break;
            }
            s.add(arr[i]);
            
        }
    }
}
