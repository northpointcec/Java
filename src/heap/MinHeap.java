package heap;

public class MinHeap {
public static void main(String[] args) {
    int[] arr = new int[] { 13, 10, 8, 12, 16, 14, 25 };
    creat(arr);
    for (int i : arr) {
        System.out.print(i + " ");
    }
}
static void creat(int[] arr) {
    int n = arr.length;
    for(int i = 1; i<n; i++) {
        insert(arr, i);
    }
}
static void insert(int[] arr, int n) {
    int i = n;
    int temp = arr[n];
    while(i>1 && temp<arr[i/2]) {
        arr[i] = arr[i/2];
        i = i/2;
    }
    arr[i] = temp;
}
}
