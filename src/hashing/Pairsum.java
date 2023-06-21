package hashing;

import java.util.HashMap;

public class Pairsum {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 45, 6, 10, 8 };
		int x = 16;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(x - arr[i])) {
				System.out.println(true);
				break;
			} else {
				map.put(arr[i], i);
			}
		}
	}
}
