package array;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] arr = { 13, 17, 18, 19, 20, 22, 22, 27, 36, 39, 46, 48, 50 };
        int[] arr1 = { 4, 12, 45 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr1[0]) {
                int temp = arr[i];
                arr[i] = arr1[0];
                arr1[0] = temp;
                for (int j = 0; j < arr1.length - 1; j++) {
                    if (arr1[j] > arr1[j + 1]) {
                        int tem = arr1[j];
                        arr1[j] = arr1[j + 1];
                        arr1[j + 1] = tem;
                    }
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
