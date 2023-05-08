package array;

public class BinarySorting {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1 };
        int low = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;
                low++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
