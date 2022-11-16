package linkedlist;

public class SingInsbeg {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node head = a;
        head.next = b;
        b.next = c;
        c.next = null;
        head = insFirst(head,10);
        display(head);
        
    }
    static void display(Node head) {
        Node cur = head;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    static Node insFirst(Node head, int data) {
        Node first = new Node(data);
        if(head == null) {
            return first;
        }
        first.next = head;
        return first;
    }
}
