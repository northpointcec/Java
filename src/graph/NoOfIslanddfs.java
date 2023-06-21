package graph;

import java.util.ArrayList;

public class NoOfIslanddfs {
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
		int noOfisland = dsfTraversal(arr);
		System.out.println(noOfisland);
	}

	public static int dsfTraversal(ArrayList<ArrayList<Integer>> adj) {
		boolean[] visited = new boolean[adj.size()];
		int count = 0;
		for (int i = 0; i < adj.size(); i++) {
			if (!visited[i]) {
				dfsrecur(adj, visited, i);
				count++;
			}
		}
		return count;
	}

	public static void dfsrecur(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int i) {
		visited[i] = true;
		for (int u : adj.get(i)) {
			if (!visited[u]) {
				dfsrecur(adj, visited, u);
			}
		}
	}

	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(v).add(u);
		adj.get(u).add(v);
	}
}
