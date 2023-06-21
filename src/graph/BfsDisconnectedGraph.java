package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsDisconnectedGraph {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			arr.add(new ArrayList<>());
			arr.get(i).add(i);
		}
		addEdge(arr, 0, 1);
		addEdge(arr, 0, 2);
		addEdge(arr, 1, 2);
		addEdge(arr, 3, 4);
		boolean[] visited = new boolean[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			if (!visited[i]) {
				bfsTravsersal(arr, visited, i);
			}
		}

	}

	public static void bfsTravsersal(ArrayList<ArrayList<Integer>> arr, boolean[] visited, int i) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(i);
		visited[i] = true;
		while (!queue.isEmpty()) {
			int u = queue.poll();
			System.out.print(u + " ");
			for (int v : arr.get(u)) {
				if (!visited[v]) {
					visited[v] = true;
					queue.add(v);
				}
			}
		}
	}

	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
}
