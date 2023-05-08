package linkedlist;

public class ReverseItr {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        Node t = reverse(head);
        Traverse.display(t);
    }
    static Node reverse(Node head) {
        Node cur = head;
        Node prev = null;
        while( cur != null) {
            Node next = cur.next;
            cur.next = prev ;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
