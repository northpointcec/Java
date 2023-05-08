package linkedlist;

public class DeleteLastD {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node head = a;
        head.next = b;
        b.prev = head;
        b.next = c;
        c.prev = b;
        c.next = null;
        head = delLast(head);
        Traverse.display(head);
    }
    static Node delLast(Node head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return null;
        }
        Node cur = head;
        while(cur.next.next != null) {
            cur = cur.next;
        }
        cur.next = null;
                return head;
    }
}
