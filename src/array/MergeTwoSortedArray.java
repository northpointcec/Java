package array;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] a = { 2,4,6,8,10,12,14};
        int[] b = { 1,3,5,7,9,11,13,15};
        int m = a.length;
        int n = b.length;
        int[] arr = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i<m && i<n) {
           if(a[i]<=b[j]) {
               arr[k] = a[i];
               k++;
               i++;
           }else {
               arr[k] = b[j];
               k++;
               j++;
           }
        }
        while(i<m) {
            arr[k] = a[i];
            k++;
            i++;
        }
        while(j<n) {
            arr[k] = b[j];
            k++;
            j++;
        }
        for(int x:arr) {
            System.out.print(x+" ");
        }
        
    }
}
