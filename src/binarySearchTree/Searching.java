package binarySearchTree;

public class Searching {

    public static void main(String[] args) {

        Node root = new Node(30);
        root.left =  new Node(20);
        root.right = new Node(40);
        root.left.left = new Node(10);
        root.left.right = new Node(25);
        root.right.left = new Node(35);
        root.right.right = new Node(50);
        System.out.println(search(root, 30));
        traverse(root);
    }
    static boolean search(Node root, int data) {
        if(root == null) {
            return false;
        }
        if(root.data == data) {
            return true;
        }
        return (root.data > data)?search(root.left, data):search(root.right, data);
     }
    static void traverse(Node root) {
        if(root != null) {
            traverse(root.left);
            System.out.print(root.data + " ");
            traverse(root.right);
        }
    }
    }
   
class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

