package sorting;

public class SelectionNavie {

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int[] temp = new int[arr.length];
        for( int i = 0; i<arr.length; i++) {
            int min = 0;
            for( int j = 1; j<arr.length; j++) {
                if(arr[min]>arr[j]) {
                    min = j;
                }
            }
            temp[i] = arr[min];
            arr[min] = Integer.MAX_VALUE;
        }
        for( int i:temp) {
            System.out.print(i+" ");
        }
    }
}
