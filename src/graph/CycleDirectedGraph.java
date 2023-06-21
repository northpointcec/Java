package graph;

import java.util.ArrayList;

public class CycleDirectedGraph {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			arr.add(new ArrayList<>());
			arr.get(i).add(i);
		}
		addEdge(arr, 0, 1);
		addEdge(arr, 2, 1);
		addEdge(arr, 2, 3);
		addEdge(arr, 3, 4);
		addEdge(arr, 4, 2);
		System.out.println(dsf(arr));
	}

	public static boolean dsf(ArrayList<ArrayList<Integer>> adj) {
		boolean[] visited = new boolean[adj.size()];
		boolean[] stk = new boolean[adj.size()];

		for (int i = 0; i < adj.size(); i++) {
			if (!visited[i]) {
				if (dsfrecur(adj, visited, stk, i)) {
					return true;
				}
			}
		}
		return false;

	}

	public static boolean dsfrecur(ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] stk, int u) {
		visited[u] = true;
		stk[u] = true;
		for (int v : adj.get(u)) {
			if (!visited[v]) {
				if (dsfrecur(adj, visited, stk, v)) {
					return true;
				}
			} else if (stk[u] == true) {
				return true;
			}
		}
		stk[u] = false;
		return false;
	}

	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);

	}
}
