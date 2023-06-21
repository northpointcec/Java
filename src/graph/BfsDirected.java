package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsDirected {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			arr.add(new ArrayList<>());
			arr.get(i).add(i);
		}
		addEdge(arr, 0, 2);
		addEdge(arr, 0, 3);
		addEdge(arr, 1, 0);
		addEdge(arr, 2, 1);
		addEdge(arr, 3, 4);
		addEdge(arr, 4, 1);
		bfsTaversal(arr, 0);
	}

	public static void bfsTaversal(ArrayList<ArrayList<Integer>> adj, int src) {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean[] visited = new boolean[adj.size()];
		visited[src] = true;
		queue.add(src);
		while (!queue.isEmpty()) {
			int u = queue.poll();
			System.out.print(u + " ");
			for (int v : adj.get(u)) {
				if (!visited[v]) {
					visited[v] = true;
					queue.add(v);
				}
			}
		}
	}

	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
	}
}
