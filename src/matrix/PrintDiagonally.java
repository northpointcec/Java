package matrix;

import java.util.ArrayList;

public class PrintDiagonally {

    public static void main(String[] args) {
        
        int[][] A = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
      ArrayList<Integer> l = new ArrayList<Integer>();
        for( int i = 0; i<A.length; i++) {
            for( int  j = 0; j<=i; j++) {
                l.add(A[j][i-j]);
                
            }
            
        }
        for( int i = 1; i<A.length; i++) {
            int j = A.length-1;
            int a  = i;
            while(a<=A.length-1 && j>=1) {
                l.add(A[a][j]);
                j--;
                a++;
            }
            
        }
        
        System.out.println(l);
        
    }
}
