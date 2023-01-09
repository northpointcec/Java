package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        for(int i = 0; i<5; i++) {
            s.push(i);
        }
        for(int i = 0; i<5; i++) {
            System.out.println(s.poll());
        }
    }
    Queue<Integer> a ;
    Queue<Integer> b;
    
    StackUsingQueue(){
        a = new LinkedList<Integer>();
        b = new LinkedList<Integer>();
    }
    public void push(int element) {
        a.add(element);
        
        while(!b.isEmpty()) {
            a.add(b.poll());
        }
        Queue<Integer> temp = a;
        a = b;
        b = temp;
    }
    public int poll() {
        if(b.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return b.poll();
    }
}
