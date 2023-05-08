package array;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {

    public static void main(String[] args) {
        int[] arr =  {16,17,4,3,5,2};
    
        ArrayList<Integer>res=new ArrayList<>();

        int rmax=Integer.MIN_VALUE;
        
       for(int i=arr.length-1;i>=0;i--){

            if(arr[i]>=rmax){

                res.add(arr[i]);

                rmax=arr[i];

            }

        }

        Collections.reverse(res);

        System.out.println(res);
    }
}
