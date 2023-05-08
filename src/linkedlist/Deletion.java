package linkedlist;

public class Deletion {

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node head = n1;
        n1.next= n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        traverse(head);
        delete(head, 2);
        traverse(head);
    }
    static void traverse( Node cur) {
        while(cur!=null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    static void delete(Node head , int pos) {
        if(pos==0) {
            head = head.next;
            return ;
            
        }
        Node cur = head;
        for(int i = 0; i<pos-1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }
}
