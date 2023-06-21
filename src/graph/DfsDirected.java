package graph;

import java.util.ArrayList;
import java.util.Stack;

public class DfsDirected {
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
		dfsTraversal(arr, 0);
	}

	public static void dfsTraversal(ArrayList<ArrayList<Integer>> adj, int src) {
		Stack<Integer> stack = new Stack<>();
		boolean[] visited = new boolean[adj.size()];
		visited[src] = true;
		stack.push(src);
		while (!stack.isEmpty()) {
			int u = stack.pop();
			System.out.print(u + " ");
			for (int v : adj.get(u)) {
				if (!visited[v]) {
					visited[v] = true;
					stack.push(v);
				}
			}
		}
	}

	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
	}
}
