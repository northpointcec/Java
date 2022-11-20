package array;

public class Intersection {

    public static void main(String[] args) {
        int[] a = {1,2,4,6,8,8};
        int[] b = {2,6,6,8,8};
        int m = a.length;
        int n = b.length;
        int i = 0, j = 0;
        while( i<m && j<n) {
            if(i>0 && a[i-1] == a[i]) {
                i++;
               continue;
            }
             if(a[i]>b[j]) {
                j++;
            }
            else if(a[i]<b[j]) {
                i++;
            }
            else if(a[i] == b[j]) {
                System.out.print(a[i]+ " ");
                i++;
                j++;
            }
        }
    }
}
