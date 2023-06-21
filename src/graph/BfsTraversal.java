package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsTraversal {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			arr.add(new ArrayList<>());
			arr.get(i).add(i);
		}
		addEdge(arr, 0, 1);
		addEdge(arr, 0, 4);
		addEdge(arr, 1, 0);
		addEdge(arr, 1, 4);
		addEdge(arr, 1, 3);
		addEdge(arr, 2, 1);
		addEdge(arr, 2, 3);
		addEdge(arr, 3, 1);
		addEdge(arr, 3, 2);
		addEdge(arr, 3, 4);
		addEdge(arr, 4, 0);
		addEdge(arr, 4, 1);
		addEdge(arr, 4, 3);
		bfsTraversal(arr, 0);
	}

	public static void bfsTraversal(ArrayList<ArrayList<Integer>> adj, int src) {
		Queue<Integer> queue = new LinkedList<>();
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

	public static void addEdge(ArrayList<ArrayList<Integer>> arr, int u, int v) {
		arr.get(u).add(v);

	}
}
