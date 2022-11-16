package linkedlist;

public class Traverse {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node head = a;
        head.next = b;
        b.next = c;
        c.next = null;
        display(head);
    }
 public static void display(Node head) {
        Node cur = head;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}
