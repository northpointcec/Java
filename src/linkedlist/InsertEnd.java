package linkedlist;

public class InsertEnd {

    public static void main(String[] args) {
       
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node head = a;
        head.next = b;
        b.next = c;
        c.next = null;
        head = insLast(head, 40);
        Traverse.display(head);
    }
    static Node insLast(Node head, int data) {
        Node last = new Node(data);
        if(head == null) {
            return last;
        }
        Node cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = last;
        return head;
    }
    
}
