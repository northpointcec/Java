package linkedlist;


public class MergeSort {

   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(8);
        Node c = new Node(1);
        Node d = new Node(3);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(5);
        Node i = new Node(4);
        Node head = a;
        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = i;
        i.next = null;
      head = merge(head);
      traverse(head);
    }
    static Node merge(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node mid = mid(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;
        left = merge(left);
        right = merge(right);
        Node result = mergesort(left,right);
        return result;
    }
    static void traverse(Node head) {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.data +" ");
            cur = cur.next;
        }
    }
    
    static Node mid(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    static Node mergesort(Node a, Node b) {
        if(a == null) {
            return b;
        }
        if(b == null) {
            return a;
        }
        Node temp = null, head= null;
        if(a.data<=b.data) {
            temp = head = a;
            a = a.next;
        }else {
            temp = head = b;
            b = b.next;
        }
        while(a != null && b != null) {
            if(a.data <= b.data) {
                temp.next = a;
                temp = a;
                a = a.next;
            }else {
                temp.next = b;
                temp = b;
                b = b.next;
            }
        }
        if(a != null) {
            temp.next = a;
            temp = a;
        }
        if(b != null) {
            temp.next = b;
            temp = b;
        }
        return head;
    }
}


