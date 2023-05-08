package tree;

public class Inorder {

    public static void main(String[] args) {
        Node Root = new Node(1);
        Root.left = new Node(2);
        Root.right = new Node(3);
        Root.left.left = new Node(4);
        Root.left.right = new Node(5);
        Root.right.left = new Node(6);
        Root.right.right = new Node(7);
        inorder(Root);
    }
    static void inorder(Node root) {
        if(root != null) {
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }
    }
}
