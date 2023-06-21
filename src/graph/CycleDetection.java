package graph;

import java.util.ArrayList;

public class CycleDetection {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			arr.add(new ArrayList<>());
			arr.get(i).add(i);
		}
		addEdge(arr, 0, 1);
		addEdge(arr, 0, 4);
		addEdge(arr, 1, 2);
		addEdge(arr, 1, 3);
		addEdge(arr, 1, 4);
		addEdge(arr, 2, 3);
		System.out.println(dsf(arr));

	}

	public static boolean dsf(ArrayList<ArrayList<Integer>> adj) {
		boolean[] visited = new boolean[adj.size()];

		for (int i = 0; i < adj.size(); i++) {
			if (!visited[i]) {
				if (dsfrecur(adj, visited, -1, i)) {
					return true;
				}
			}
		}
		return false;
		
	}

	public static boolean dsfrecur(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int parent, int u) {
		visited[u] = true;
		for (int v : adj.get(u)) {
			if (!visited[v]) {
				if (dsfrecur(adj, visited, u, v)) {
					return true;
				}
			} else if (u != parent) {
				return true;
			}
		}
		return false;
	}

	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(v).add(u);
		adj.get(u).add(v);
	}
}
