package sorting;

public class InsertionReverse {

    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,3};
        for(int i = arr.length-2; i>=0; i--) {
            int key = arr[i];
            int j = i+1;
            while(j<arr.length && arr[j]>key) {
                arr[j-1] = arr[j];
                j++;
            }
            arr[j-1] = key;
        }
        for(int a:arr) {
            System.out.print(a + " ");
        }
    }
}
