package practice;

public class BinarySearch {

    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5};
     int n = arr.length;
     int k = 4;
     System.out.println(binarySearch(arr , n , k));
    }
    static int binarySearch(int[] arr , int n , int k) {
        int low = 0; 
        int high = n-1;
        while(low<=high) {
            int mid = (low + high)/2;
            if(arr[mid]==k) {
                return mid;
            }
            if(arr[mid]>k) {
                high = mid -1;
            }
            if(arr[mid]<k) {
                low = mid+1;
            }
        }
        return -1;
    }
}
