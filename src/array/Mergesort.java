package array;

public class Mergesort {

   public static void main(String[] argss) {
       int[] arr = {10,5,30,15,7};
       int l = 0; 
       int r = arr.length-1;
       mergesort(arr, l, r);
       for(int a:arr) {
           System.out.print( a + " ");
       }
   }
   static void mergesort(int[] arr, int l, int r) {
       if(r>l) {
           int m = l + (r-l)/2;
           mergesort( arr, l, m);
           mergesort( arr, m+1, r);
           merge(arr, l, m, r);
       }
   }
   static void merge(int[] arr, int l, int m, int r) {
       int a = m-l+1;
       int b = r-m;
       int[] left = new int[a];
       int[] right = new int[b];
       for( int i = 0; i<a; i++) {
           left[i] = arr[l+i];
       }
       for(int j = 0; j<b; j++) {
           right[j] = arr[m+1+j];
       }
       int i = 0, j = 0, k = l;
       while(i<a && j<b) {
          if(left[i] <= right[j]) {
              arr[k]  = left[i];
              k++;
              i++;
          }else {
              arr[k] = right[j];
              k++;
              j++;
          }
       }
       while(i<a) {
           arr[k] = left[i];
           k++; 
           i++;
       }
       while(j<b) {
           arr[k] = right[j];
           j++;
           k++;
       }
   }
}
