package tree;

public class Size {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        System.out.println(size(root));
    }

    static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return size(root.left) + 1 + size(root.right);
    }
}
