package collections.tree.binaryTree;

import java.util.ArrayList;
import java.util.List;

class Node {
	int data;
	Node right = null, left = null;

	public Node(int data) {
		this.data = data;
	}
}

public class BinaryTree {
	Node root;
	public static List<Integer> treeData = new ArrayList<>();

	public void inOrderTravesal(Node node, boolean print) {
		if (node == null)
			return;
		inOrderTravesal(node.left, print);
		if (!print)
			treeData.add(node.data);
		else
			System.out.println(node.data);
		inOrderTravesal(node.right, print);
	}

	public static Node insert(Node node, int key) {
		if (node == null) {
			node = new Node(key);
		} else if (key < node.data) {
			node.left = insert(node.left, key);
		} else {
			node.right = insert(node.right, key);
		}
		return node;
	}

	public static boolean contains(Node node, int value) {
		if (value == node.data) {
			return true;
		} else {
			if (value < node.data) {
				if (node.left == null) {
					return false;
				} else {
					return contains(node.left, value);
				}
			} else {
				if (node.right == null) {
					return false;
				} else {
					return contains(node.right, value);
				}
			}
		}
	}

	public static Node buildBinary(List<Integer> ns, int s, int e) {
		if (s > e) {
			return null;
		}
		int m = (s + e) / 2;
		Node n = new Node(ns.get(m));
		n.left = buildBinary(ns, s, m - 1);
		n.right = buildBinary(ns, m + 1, e);
		return n;

	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.left.left = new Node(7);
		tree.root.left.left.left = new Node(6);
		tree.root.left.left.left.left = new Node(5);
		System.out.println("Inorder traversal of balanced BST is :");
		tree.inOrderTravesal(tree.root, false);
		tree.root = null;
		for (Integer i : treeData) {
			System.out.println(i);
		}
		tree.root = buildBinary(treeData, 0, treeData.size() - 1);
		System.out.println("After balancing : ");
		tree.inOrderTravesal(tree.root, true);
	}

}
