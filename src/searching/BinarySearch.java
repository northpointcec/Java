package searching;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
       System.out.println(bin(arr , n));
    }
    static int bin( int[] arr , int n) {
        int low = 0; 
        int high = arr.length -1;
        while(low<=high) {
            int mid = (high + low)/2;
            if(arr[mid] == n) {
                return mid;
            }else if(arr[mid]>n) {
                high = mid-1;
            }else {
               low = mid+1;
            }
        }
        return -1;
    }
}
