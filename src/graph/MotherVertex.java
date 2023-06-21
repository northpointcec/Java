package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MotherVertex {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 5; i++) {
			adj.add(new ArrayList<>());
		}
		for (int i = 0; i < 5; i++) {
			adj.get(i).add(i);
		}
		addedge(adj, 0, 2);
		addedge(adj, 0, 3);
		addedge(adj, 1, 0);
		addedge(adj, 2, 1);
		addedge(adj, 3, 4);
		boolean[] visited = new boolean[5];
		int count = 0;
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			if (!visited[i]) {
				 count = traversal(adj, visited, i);
			}
			Arrays.fill(visited, false);
			if(count == 5) {
				ans = Math.min(ans, i);
			}
			
		}
		System.out.println(count);
	}

	public static int traversal(ArrayList<ArrayList<Integer>> adj, boolean[] visted, int i) {
		visted[i] = true;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(i);
		int count = 1;
		while (!queue.isEmpty()) {
			int u = queue.poll();
			
			for (int v : adj.get(u)) {
				if (!visted[v]) {
					visted[v] = true;
					queue.add(v);
					count++;
				}
				
			}
		}
		return count;
	}

	public static void addedge(ArrayList<ArrayList<Integer>> adj, int v, int u) {
		//adj.get(u).add(v);
		adj.get(v).add(u);
	}
}
