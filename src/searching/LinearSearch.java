package searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        sc.close();
        int[] arr = {9,8,7,6,5,4,3,2,1};
        for( int i = 0; i<arr.length; i++) {
           if(arr[i] == n) {
               System.out.println(i);
               break;
           }
        }
    }
}
