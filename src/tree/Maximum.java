package tree;

public class Maximum {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        System.out.println(maximum(root));
    }

    static int maximum(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int res = root.data;
        int lres = maximum(root.left);
        int rres = maximum(root.right);
        if (lres > res) {
            res = lres;
        }
        if (rres > res) {
            res = rres;
        }
        return res;
    }

}
