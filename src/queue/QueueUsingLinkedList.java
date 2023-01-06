package queue;

public class QueueUsingLinkedList {

    public static void main(String[] args) {
        Queued q = new Queued();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        
        
        
    }
}

class Queued{
    Node front ;
    Node rear;
    Queued(){
        front = rear = null;
    }
    void enqueue(int data) {
        Node temp = new Node(data);
        if(front == null) {
            front = rear = temp;
        }else {
            rear.next = temp;
            rear = temp;
        }
    }
    void dequeue() {
        if(front == null) {
            System.out.println("Queue is empty");
            System.exit(-1);
        }
        int data = front.data;
        System.out.println(data);
        front = front.next;
        if(front == null) {
            rear = null;
        }
    }
}