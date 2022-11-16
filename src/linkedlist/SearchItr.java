package linkedlist;

public class SearchItr {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node head = a;
        head.next = b;
        b.next = c;
        c.next = null;
        System.out.println(search(head,20));
    }
    static int search(Node head, int data) {
        int count  = 0;
        Node cur ;
        if(head == null) {
            return -1;
        }
       for( cur = head; cur != null; cur = cur.next ) {
           count++;
           if(cur.data == data) {
               return count;
           }
       }
        return -1;
    }
}
