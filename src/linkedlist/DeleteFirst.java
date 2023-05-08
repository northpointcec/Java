package linkedlist;

public class DeleteFirst {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node head = a;
        head.next = b;
        b.next = c;
        c.next = null;
        head = delFirst(head);
        Traverse.display(head);
    }
    static Node delFirst(Node head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return null;
        }
        return head.next;
    }
}
