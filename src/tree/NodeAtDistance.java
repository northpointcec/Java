package tree;

public class NodeAtDistance {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        distance(root, 2);
    }

    static void distance(Node root, int k) {
        if (root == null) {
            return;
        } else if (k == 0) {
            System.out.print(root.data + " ");
        }
        distance(root.left, k - 1);
        distance(root.right, k - 1);
    }
}
