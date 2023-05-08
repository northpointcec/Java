package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInbuilt {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i<5; i++) {
            q.add(i);
        }
        q.remove();
        System.out.println(q.poll());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        q.removeAll(q);
        
        for(int i = 0; i<10; i++) {
            q.add(i);
        }
       System.out.println(q.peek());
        System.out.println(q);
    }
}
