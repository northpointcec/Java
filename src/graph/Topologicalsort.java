package graph;

import java.util.ArrayList;
import java.util.Stack;

public class Topologicalsort {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			arr.add(new ArrayList<>());
			arr.get(i).add(i);
		}
		addEdge(arr, 0, 2);
		addEdge(arr, 0, 3);
		addEdge(arr, 1, 3);
		addEdge(arr, 1, 4);
		addEdge(arr, 2, 3);
		dsf(arr);
	}

	public static void dsf(ArrayList<ArrayList<Integer>> adj) {
		boolean[] visited = new boolean[adj.size()];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < adj.size(); i++) {
			if (!visited[i]) {
				dsfrecur(adj, visited, stack, i);
			}
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}

	}

	public static void dsfrecur(ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> stk, int u) {
		visited[u] = true;

		for (int v : adj.get(u)) {
			if (!visited[v]) {
				dsfrecur(adj, visited, stk, v);
			}
		}
		stk.add(u);

	}

	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);

	}

}
