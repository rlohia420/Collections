package collections.tree.binaryTree;

public class BinarySearchTree {

	public boolean isBst(Node node) {
		if (node == null)
			return true;
		if (node.left != null && maxValue(node.left) > node.data)
			return false;
		if (node.right != null && minValue(node.right) < node.data)
			return false;
		if (!isBst(node.left) || !isBst(node.right)) {
			return false;
		}
		return true;
	}

	public int maxValue(Node node) {
		Node current = node;
		/* loop down to find the leftmost leaf */
		while (current.right != null) {
			current = current.right;
		}
		return (current.data);
	}

	public int minValue(Node node) {
		Node current = node;
		/* loop down to find the leftmost leaf */
		while (current.left != null) {
			current = current.left;
		}
		return (current.data);
	}
}
