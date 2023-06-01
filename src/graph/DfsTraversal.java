package graph;

import java.util.ArrayList;

public class DfsTraversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 5; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < 5; i++) {
            arr.get(i).add(i);
        }
        arr.get(0).add(1);
        arr.get(0).add(3);
        arr.get(0).add(2);
        arr.get(1).add(3);
        arr.get(1).add(4);
        arr.get(2).add(0);
        arr.get(2).add(3);
        arr.get(3).add(0);
        arr.get(3).add(1);
        arr.get(3).add(4);
        arr.get(4).add(1);
        arr.get(4).add(3);
        dsf(arr);
    }

    public static void dsf(ArrayList<ArrayList<Integer>> arr) {
        boolean[] visited = new boolean[5];
        dsfrecur(arr, visited, 0);
    }

    public static void dsfrecur(ArrayList<ArrayList<Integer>> arr, boolean[] visited, int s) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int u : arr.get(s)) {
            if (visited[u] == false) {
                dsfrecur(arr, visited, u);
            }
        }
    }
}
