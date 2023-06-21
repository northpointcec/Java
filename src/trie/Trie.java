package trie;

public class Trie {
	public static Node root = new Node();

	public static void main(String[] args) {
		String[] names = { "ajay", "raj", "varma", "karmipatti" };
		for (int i = 0; i < names.length; i++) {
			insert(names[i]);
		}
		System.out.println(search("ajay"));
	}

	public static boolean search(String key) {
		Node cur = root;
		for (int i = 0; i < key.length(); i++) {
			int ind = key.charAt(i) - 'a';
			if (cur.child[ind] == null) {
				return false;
			}
			if (i == key.length() - 1 && cur.child[ind].end == false) {
				return false;
			}
			cur = cur.child[ind];
		}
		return true;
	}

	public static void insert(String word) {
		Node cur = root;
		for (int i = 0; i < word.length(); i++) {
			int ind = word.charAt(i) - 'a';
			if (cur.child[ind] == null) {
				cur.child[ind] = new Node();
			}
			if (i == word.length() - 1) {
				cur.child[ind].end = true;
			}
			cur = cur.child[ind];
		}
	}
}

class Node {
	Node[] child;
	boolean end;

	Node() {
		child = new Node[26];
		end = false;
		for (int i = 0; i < 26; i++) {
			child[i] = null;
		}
	}
}
