package linkedlist;

public class Traverse1 {

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
    static void display(Node head) {
        if(head == null) {
            return ;
        }
        System.out.println(head.data);
        display(head.next);
    }
}
