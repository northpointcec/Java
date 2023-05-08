package linkedlist;

public class InsBegDoubly {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node head = a;
        head.prev = null;
        head.next = b;
        b.prev = head;
        b.next = c;
        c.prev = b;         
        c.next = null;
        head = ins(head,10);
        Traverse.display(head);
       
    }
   static Node ins(Node head, int data) {
       Node fir = new Node(data);
       fir.prev = null;
       if(head == null) {
           return fir;
       }
       fir.next = head;
       head.prev = fir;
       return fir;
   }
}
