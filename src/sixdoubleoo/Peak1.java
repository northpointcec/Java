package sixdoubleoo;

import java.util.Random;
import java.util.Scanner;

public class Peak1 {

    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rd = new Random();
        for( int i = 0; i<n; i++) {
            arr[i] = rd.nextInt();
        }
        sc.close();
        for( int i = 1 ; i<arr.length-1; i++) {
            if(arr[i-1]>arr[i]) {
                System.out.println(i);
                break;
            }
            if(i == arr.length-1 && arr[arr.length-1]>arr[arr.length-2]) {
                System.out.println(i);
                break;
            }
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1] && i!=0) {
                System.out.println(i);
                break;
            }
        }
        long end = System.nanoTime();
        System.out.println("hello");
        System.out.println((end-start));
    }
}
