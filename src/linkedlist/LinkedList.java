package linkedlist;

public class LinkedList {

    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head ;
    public Node tail;
    
    public void insert(int no) {
        Node a = new Node(no);
        if(head == null) {
            head = a;
            tail = a;
            
        }else {
            tail.next = a;
            tail = a;
        }
    }
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
            
        }
    }
    public void m() {
        System.out.println(head.data);
        System.out.println(head);
        System.out.println(head.next);
        System.out.println(tail.data);
        System.out.println(tail);
        System.out.println(tail.next);
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(10);
        l.m();
        System.err.println("First element");
        l.insert(20);
        l.m();
        System.err.println("Second element");
        l.insert(30);
        l.m();
        System.err.println("Third element");
        l.insert(40);
        l.m();
        System.err.println("Fourth element");
        l.insert(50);
        l.m();
        System.err.println("Fifth element");
        l.display();
    }
}
