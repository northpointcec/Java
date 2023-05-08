package linkedlist;

public class DetectCycle {


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node head = a;
        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = c;
        int data = detectcycle(head);
        System.out.println(data);
    }
    static int detectcycle(Node head) {
        Node f = head;
        Node s = head;
        while(f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if(s == f) {
                System.out.println("Yes there is a cycle");
                return s.data;
            }
        }
        return -1;
    }
}
