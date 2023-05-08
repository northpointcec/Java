package sorting;

public class QuickUsingLomuto {

    public static void main(String[] args) {
        int[] arr = {5,13,6,9,12,11,8};
        int low = 0;
        int high = arr.length-1;
        quicksort(arr,low, high);
        for(int a:arr){
            System.out.print(a + " ");
        }
    }
    static void quicksort(int[] arr, int l, int h){
        if(l<h){
            int p = lomuto(arr, l, h);
            quicksort(arr,l,p-1);
            quicksort(arr,p,h);
        }
    }
    static int lomuto(int[] arr, int l , int h){
        int p = arr[h];
        int i = l-1;
        for(int j = l; j<=h-1; j++){
            if(arr[j]<p){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[h];
        arr[h] = arr[i+1];
        arr[i+1]= temp;
        return i+1;
    }
}
