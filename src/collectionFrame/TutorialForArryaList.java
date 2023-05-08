package collectionFrame;

import java.util.ArrayList;

public class TutorialForArryaList {
	
	public static void main(String[] args) {
		int n = 10;
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		
		for( int i = 0; i<=10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		System.out.println(list.get(0));
		
		for(int i:list) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for( int i:list) {
			System.out.print(list.get(i)+ " ");
		}
		//remove the element present at index 1
				list.remove(1);
				System.out.println();
				
				System.out.println(list);
				
				ArrayList<Integer> arr = new ArrayList<Integer>(list);
				System.out.println(arr);
				//methods
				//add(index , value)
				//add(value)
				//addall(collection)
				System.out.println(list.size());
				
				
	}

}
