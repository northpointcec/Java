package tree;


public class BinaryToDLL {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        Node root = a;
        root.left = b;
        root.right = c;
        root.left.left = d;
        root.left.right = e;
        root.right.left = f;
        root.right.right = g;
        inorder(root);
        Node head = dll(root);
        System.out.println();
        traverse(head);
        
    }
    static void traverse(Node head) {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.right;
        }
    }
    static Node prev = null;
    static Node dll(Node root) {
        if(root == null) {
            return root;
        }
        Node head = dll(root.left);
        if(prev == null) {
            head = root;
        }else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        dll(root.right);
        return head;
        
    }
    
    static void inorder(Node root) {
        if(root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}
