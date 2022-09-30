package hashSet;

import java.util.HashSet;

public class Foreach {
	
	public static void main(String[] args) {
		//Method inherited from java.lang.Iterable
		HashSet<Integer> set = new HashSet<Integer>();
		for( int i = 0; i<10; i++) {
			set.add(i);
		}
		for(int i:set) {
			System.out.print(i+" ");
		}
	}

}
