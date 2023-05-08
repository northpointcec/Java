package linkedlist;

public class DoublyLinkedList {

    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void insert(int data) {
        Node a = new Node(data);
        if(head == null) {
            head = a;
            tail = a;
            head.prev = null;
        }else {
            tail.next = a;
            a.prev = tail;
            tail = a;
            tail.next = null;
                    
        }
    }
    public void display() {
        Node cur = head;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    public void displays() {
        Node cur = tail;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.prev;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.display();
        l.displays();
    }
}

