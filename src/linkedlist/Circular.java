package linkedlist;

public class Circular {

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
        traverse(head);
        
    }
    static void traverse(Node head) {
        if(head == null) {
            System.out.println("null");
            return;
        }
        Node cur = head;
        do {
            System.out.println(cur.data);
            cur = cur.next;
            
        }while(cur != head);
            
    }
}
