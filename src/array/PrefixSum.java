package array;

public class PrefixSum {

    public static void main(String[] args) {
        
        int[] arr = new int[] {2,8,3,9,6,5,4};
        prefixSum(arr, 1, 2);
        
    }
    static void prefixSum(int[] arr, int l, int h) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        for(int i = 1; i<arr.length; i++) {
            temp[i] = arr[i] + temp[i-1];
        }
      if(l ==0) {
          System.out.println(temp[h]);
      }else {
          System.out.println(temp[h] - temp[l-1]);
      }
    }
}
