package linkedlist;

public class Middle {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node head = a;
        head.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        Traverse.display(head);
        middle(head);
    }
    static void middle(Node head) {
        Node one = head , two = head;
        while(two !=null && two.next != null) {
            one = one.next;
            two = two.next.next;
        }
        System.out.println(one.data);
        return;
    }
}
