package bitManipulation;

public class FindMissing {

    public static void main(String[] args) {
        int[] arr = {6,1,2,8,3,4,7,10,5};
        int n = 10;
        int x = 0;
        for( int i = 0; i<arr.length; i++) {
            x^=arr[i];
        }
        for( int i = 1; i<=n; i++) {
            x^=i;
        }
        System.out.println(x);
    }
}
