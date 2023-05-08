package linkedlist;

public class Demo {

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node head = n1;
        head.next = n2;
        n2.next = n3; 
        n3.next = null;
        traverse(head);
    }
   public static void traverse(Node curr) {
        while(curr!=null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
class Node{
    int data ;
    Node next;
    Node prev;
    Node( int data){
        this.data = data;
    }
}
