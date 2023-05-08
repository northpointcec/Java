package hashSet;

import java.util.HashSet;

public class CountNonrepeatingPart {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,5,6,7};
		HashSet<Integer> s = new HashSet<Integer>();
		for( int i = 0; i<arr.length-1; i++) {
			s.add(arr[i]);
			if(s.contains(arr[i+1])) {
				s.remove(arr[i]);
			}
		}
		System.out.println(s);
	}
}
