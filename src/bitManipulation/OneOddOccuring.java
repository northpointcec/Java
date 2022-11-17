package bitManipulation;

public class OneOddOccuring {

    public static void main(String[] args) {
        int[] arr = { 1,2,8,1,8,2,7};
        int no = 0;
        for( int i = 0; i<arr.length ; i++) {
            no = no^arr[i];
        }
        System.out.println(no);
    }
}
