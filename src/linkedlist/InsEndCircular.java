package linkedlist;

public class InsEndCircular {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node head = a;
        head.next = b;
        b.next = c;
        c.next = d;
        d.next = head;
        head = insEnd(head, 50);
        Circular.traverse(head);
    }
    static Node insEnd(Node head , int data) {
        Node fir = new Node(data);
        fir.next = head.next;
        head.next = fir;
        int t = head.data;
        head.data = fir.data;
        fir.data = t;
        return fir;
    }
}
