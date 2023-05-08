package mathematics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FibonacciUsingQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        q.add(1);
        for(int i = 0; i<n; i++) {
            int a = q.remove();
            int b = q.remove();
            q.add(b);
            q.add(a+b);
            System.out.print(a+ " ");
        }
    }
}
