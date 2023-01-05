package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {

    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i<=3; i++) {
            a.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i<=3; i++) {
            a.get(i).add(i);
        }
        
        a.get(0).add(1);
        a.get(0).add(2);
        a.get(0).add(3);
        a.get(1).add(0);
        a.get(1).add(3);
        a.get(1).add(2);
        a.get(2).add(0);
        a.get(2).add(1);
        a.get(2).add(3);
        a.get(3).add(0);
        a.get(3).add(2);
        a.get(3).add(1);
        traverse(a,0,4);
        
    }
    static void traverse(ArrayList<ArrayList<Integer>> a, int s,int v) {
        boolean[] visited = new boolean[v];
        bfs(a,visited,s);
    }
    static void bfs(ArrayList<ArrayList<Integer>> a, boolean[] visited,int s) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);
        visited[s] = true;
        
        while(q.isEmpty() == false) {
           int u = q.poll();
           System.out.print(u + " ");
            for(int j:a.get(u)) {
                
                if(visited[j] == false) {
                    visited[j] = true;
                    q.add(j);
                }
            }
        }
    }
}

