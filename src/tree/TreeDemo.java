package tree;

public class TreeDemo {

    public static void main(String[] args) {
        Node Root = new Node(1);
        Root.left = new Node(2);
        Root.right = new Node(3);
        Root.left.left = new Node(4);
        Root.left.right = new Node(5);
        Root.right.left = new Node(6);
        Root.right.right = new Node(7);
        preorder(Root);
    }
    static void preorder(Node root) {
        if(root != null) {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
