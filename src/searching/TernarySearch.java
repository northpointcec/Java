package searching;

import java.util.Scanner;

public class TernarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int l = 0; 
        int r = arr.length-1;
        while(l<=r) {
            int mid1 = l + (r-l)/3;
            int mid2 = r - (r-l)/3;
            if(arr[mid1]==n) {
                System.out.println(mid1);
                break;
            }else if( arr[mid2] == n) {
                System.out.println(mid2);
                break;
            }else if( arr[mid1]>n) {
                r = mid1-1;
            }else if(arr[mid1]<n && arr[mid2]>n) {
                l = mid1+1;
                r = mid2-1;
            }else {
                l = mid2 +1;
            }
        }
    }
}
