package recursion;

public class Searching {

    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,3};
        System.out.println(ser(arr, 0, 3));
    }
    static int ser(int[] arr, int i, int x) {
        if(i>=arr.length) {
            return -1;
        }
        if(arr[i] == x) {
            return i;
        }
        return ser(arr, i+1, x);
    }
}
