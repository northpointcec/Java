package linkedlist;

public class Insertion {

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node head = n1; 
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        traverse(head);
       insert(40 , head , 2);
       traverse(head);
    }
    static void insert(int data , Node head  , int pos) {
        Node add = new Node(data);
        if(pos == 0) {
            add.next = head;
            head = add ;
            return;
        }
        Node curr = head;
        for( int i = 0; i<pos-1; i++) {
            curr = curr.next;
        }
        add.next = curr.next;
        curr.next = add;
    }
    static void traverse(Node curr) {
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
