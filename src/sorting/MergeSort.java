package sorting;


public class MergeSort {
    
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        
        int l = 0;
        int h = arr.length-1;
        mergesort(arr, l, h);
        for(int i:arr) {
            System.out.print(i + " ");
        }
    }
    static void mergesort(int[] arr, int l, int h) {
        if(l<h) {
            int mid = l + (h-l)/2;
            mergesort(arr, l, mid);
            mergesort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }
    static void merge(int[] arr, int l, int m, int h) {
        int[] a = new int[m-l+1];
        int[] b = new int[h-m];
        for( int i = 0; i<a.length; i++) {
            a[i] = arr[l +i];
        }
        for(int i = 0; i<b.length; i++) {
            b[i] = arr[m+1+i];
        }
        int i = 0, j = 0, k =l;
        while(i<a.length && j<b.length) {
            if(a[i]<=b[j]) {
                arr[k++] = a[i++];
            }else {
                arr[k++] = b[j++];
            }
        }
        while(i<a.length) {
            arr[k++] = a[i++];
        }
        while(j<b.length) {
            arr[k++] = b[j++];
        }
    }

}
