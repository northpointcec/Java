package bitManipulation;

public class MaxAnd {

    public static void main(String[] args) {
        int[] arr = {4,8,16,2};
        int max = 0;
        for( int i = 0; i<arr.length; i++) {
            for( int j = 1; j<arr.length ; j++) {
                int and =0;
                if (i!=j) {
                   and = arr[i]&arr[j];
                }
               
                if(and>max) {
                    max = and;
                }
            }
        }
        System.out.println(max);
    }
}
