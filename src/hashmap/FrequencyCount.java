package hashmap;

import java.util.HashMap;

public class FrequencyCount {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,5,6,7};
		HashMap< Integer , Integer> hmp = new HashMap<Integer , Integer>();
		for(  int i = 0; i<arr.length ; i++) {
			//  int key = arr[i];
	            if(hmp.containsKey(arr[i]) == true)
	              hmp.put(arr[i], hmp.get(arr[i]) + 1);
	            else
	              hmp.put(arr[i], 1);    
		}
		System.out.println(hmp);
	System.out.println(hmp.get(4));
	}
}
