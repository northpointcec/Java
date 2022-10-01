package array;

public class KadanesAlgo {

    public static void main(String[] args) {
        int[] arr = {5,-4,-2,6,-1};
        System.out.println(KadanesAlgo.maxSubArraysum(arr));
    }
    static int maxSubArraysum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int curr = 0; 
        for( int i = 0; i<arr.length; i++) {
            curr = curr + arr[i];
            if(curr>max) {
                max = curr;
            }
            if(curr<0) {
                curr=0;
            }
        }
        return max;
    }
}
