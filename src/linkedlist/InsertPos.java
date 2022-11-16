package linkedlist;

public class InsertPos {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node head = a;
        head.next = b;
        b.next = c;
        c.next = null;
        head = insPos(head , 2,15);
        Traverse.display(head);
    }
    static Node insPos(Node head, int pos, int data) {
        Node mid = new Node(data);
        if(pos == 1) {
            mid.next = head;
            return mid;
        }
        Node cur = head;
        for( int i = 1; i<= pos-2 && cur != null; i++) {
            cur = cur.next;
        }
        if(cur == null) {
            return null;
        }
        mid.next = cur.next;
        cur.next = mid;
        return head;
    }
}
