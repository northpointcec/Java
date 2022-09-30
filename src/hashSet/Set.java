package hashSet;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		//method inherited from java.util.set
		HashSet<Integer> set = new HashSet<Integer>();
		for( int i = 0; i<10; i++) {
			set.add(i);
		}
		
		
		
		System.out.println(set);
		HashSet<Integer> set1 = new HashSet<Integer>();
		for( int i = 11; i<21; i++) {
			set1.add(i);
		}
		System.out.println(set1);
		
		
		
		set.addAll(set1);
		System.out.println(set);
		
		
		
		if(set.containsAll(set1)) {
			System.out.println("Present all elements");
		}
		
		
		
		if(set.equals(set1)) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equals");
		}
		System.out.println(set.hashCode());
		System.out.println(set1.hashCode());
		
		
		set.removeAll(set1);
		System.out.println(set);
		
		Object[] arr = set.toArray();
		for(Object i:arr) {
			System.out.print(i+" ");
		}
		
	}
}
