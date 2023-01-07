package queue;

public class CircularQueue {

    public static void main(String[] args) {
        CQueue q = new CQueue(10);
        for(int i = 0; i<10; i++) {
            q.add(i);
        }
      System.out.println(q.remove());
      System.out.println(q.remove());
      System.out.println(q.remove());
      System.out.println(q.remove());
     
    }
}
class CQueue{
    int[] queue;
    int size;
    int front =0;
    int rear =0;
    CQueue(int capacity){
        queue = new int[capacity];
    }
    public void add(int element) {
        if(size == queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        rear  = (rear +1)%queue.length;
        queue[rear ] = element;
        size++;
    }
    public int remove() {
        if(size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
      
        front = (front+1)%queue.length;
        int element = queue[front];
        size--;
        return element;
        
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isfull() {
        return size == queue.length;
    }
}
