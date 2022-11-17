package bitManipulation;

public class TwoOddOccuring {

    public static void main(String[] args) {
        int[] arr = {1,5,6,6,1,6};
        int x = 0;
        for( int i = 0; i<arr.length; i++) {
            x = x^arr[i];
        }
        int k =  x & ~(x-1);
        int a =0 , b = 0;
        for( int i = 0; i<arr.length; i++) {
            if((arr[i] & k)!=0) {
                a = a^arr[i];
            }else {
                b = b^arr[i];
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
