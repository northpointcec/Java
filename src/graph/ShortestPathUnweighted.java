package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUnweighted {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			arr.add(new ArrayList<>());
			arr.get(i).add(i);
		}
		System.out.println(arr.get(0));
		addEdge(arr, 0, 1);
		addEdge(arr, 0, 4);
		addEdge(arr, 1, 2);
		addEdge(arr, 1, 3);
		addEdge(arr, 1, 4);
		addEdge(arr, 2, 3);
		addEdge(arr, 3, 4);
		int[] dist = shortestdistance(arr, 1);
		for (int i : dist) {
			System.out.print(i + " ");
		}
	}

	public static int[] shortestdistance(ArrayList<ArrayList<Integer>> adj, int src) {
		boolean[] visited = new boolean[adj.size()];
		int[] dist = new int[adj.size()];
		Queue<Integer> queue = new LinkedList<>();
		dist[src] = 0;
		visited[src] = true;
		queue.add(src);
		while (!queue.isEmpty()) {
			int u = queue.poll();
			for (int v : adj.get(u)) {
				if (!visited[v]) {
					dist[v] = dist[u] + 1;
					visited[v] = true;
					queue.add(v);
				}
			}
		}
		return dist;
	}

	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(v).add(u);
		adj.get(u).add(v);
	}
}
