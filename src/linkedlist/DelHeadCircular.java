package linkedlist;

public class DelHeadCircular {

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
        Circular.traverse(del(head));
    }
    static Node del(Node head) {
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
}
