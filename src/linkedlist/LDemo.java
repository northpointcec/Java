package linkedlist;

public class LDemo {

    class Node{
        int data;
        Node next;
        
        public Node(int data) {
            this.next = null;
            this.data = data;
        }
                
    }
    public Node head = null;
    public Node tail = null;
    public void insert(int data) {
        Node a = new Node(data);
        if(head == null) {
            head = a;
            tail = a;
        }else {
            tail .next = a;
            tail = a;
        }
    }
    public void display() {
        if(head == null) {
            System.out.println("the linked list is empty");
        }
        Node cur = head;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    public static void main(String[] args) {
        LDemo a = new LDemo();
        a.insert(10);
        a.insert(20);
        a.insert(30);
        a.insert(40);
        a.insert(50);
        a.display();
    }
}
