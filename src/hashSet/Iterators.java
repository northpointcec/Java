package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		HashSet<Integer> set  = new HashSet<Integer>();
		for( int i = 0; i<10; i++) {
			set.add(i);
		}
		Iterator<Integer> e = set.iterator();
		while(e.hasNext()) {
			System.out.print(e.next()+" ");
		}
	}
}
