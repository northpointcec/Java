package array;

public class PrintTwoarrayinsorted {

    public static void main(String[] args) {
        int[] a = { 2,4,6,8,10,12,14 };
        int[] b = { 1,3,5,7,9,11,13};
        int m = a.length;
        int n = b.length;
        int i = 0,j = 0;
        while( i<m && j<n) {
            if(a[i]<= b[j]) {
                System.out.print(a[i] + " ");
                i++;
            }else {
                System.out.print(b[j] + " ");
                j++;
            }
        }
        while(i<m) {
            System.out.print(a[i] + " ");
            i++;
        }
        while(j<n) {
            System.out.print(b[j] + " ");
            j++;
        }
    }
}
