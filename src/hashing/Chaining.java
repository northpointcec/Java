package hashing;


import java.util.Arrays;

public class Chaining {

    public static void main(String[] args) {
    
        Hash h = new Hash(9);
        h.insert(7);
        h.insert(14);
        h.insert(21);
        h.insert(28);
        h.insert(35);
        h.insert(42);
        h.insert(49);
        h.insert(56);
        h.insert(0);
        h.insert(1);
        h.insert(15);
        h.insert(16);
        h.insert(17);
        h.insert(18);
        h.insert(19);
        h.insert(20);
        h.insert(2);
        h.insert(3);
        h.insert(4);
        h.insert(5);
        h.insert(6);
        for(int i = 0; i<=7; i++) {
            h.traverse(i);
        }
        
    }
}
class Hash{
    int h ;
    int x = 7;
    Node[] table;
    Hash(int data){
        this.h = data;
        table = new Node[h];
        Arrays.fill(table, null);
    }
    void traverse(int data) {
        int i = data%x;
        Node cur  = table[i];
        if(table[i] == null) {
            System.out.print("this field is empty");
        }
        while(cur != null) {
            System.out.print(cur.data+ " ");
            cur = cur.next;
        }
        System.out.println();
    }
    void insert(int data) {
        int i = data%x;
        
        Node cur = new Node(data);
        if(table[i] == null) {
            table[i] = cur;
        }else {
            Node d = table[i];
            while(d.next != null ) {
                d = d.next;
            }
            d.next = cur;
            d = cur;
                
        }
        
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}