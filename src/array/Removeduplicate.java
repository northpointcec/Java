package array;

public class Removeduplicate {

    public static void main(String[] args) {
        int[] arr = {10,20,20,20,30,30,40,50};
        int n = remove(arr);
        for( int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int remove(int[] arr) {
        int j = 1; 
        for( int i = 1; i<arr.length; i++) {
            if(arr[i] != arr[j-1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}
