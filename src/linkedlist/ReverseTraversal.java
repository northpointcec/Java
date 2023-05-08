package linkedlist;

public class ReverseTraversal {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node head = a;
        head.prev = null;
        head.next = b;
        b.prev = head;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;
        display(d);
    }
    static void display(Node tail) {
        Node cur = tail;
     
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.prev;
        }
    }
}
