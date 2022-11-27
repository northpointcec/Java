package queue;

public class QueueDemo {

public static void main(String[] args) {
        
        Que q = new Que();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
    }
}
class Node{
    Node next ;
    int data ;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class Que{
    Node front;
    Node rear;
    int size;
    Que(){
        front = rear = null;
        size = 0;
    }
    void enque( int data) {
        Node temp = new Node(data);
        size++;
        if(front == null) {
            front = temp;
            rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
        
    }
    int deque() {
        if(front == null) {
            return -1;
        }
        Node temp = front;
        front = front.next;
        return temp.data;
    }
}
