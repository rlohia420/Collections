package collections.tree.binaryTree;

public class MirrorImage {

	public Node mirror(Node node) {
		if (node == null) {
			return node;
		}
		Node left = mirror(node.left);
		Node right = mirror(node.right);
		node.left = right;
		node.right = left;
		return node;
	}

	public boolean areMirror(Node a, Node b) {
		if (a == null && b == null) {
			return true;
		}
		if (a == null || b == null)
			return false;
		return ((a.data == b.data) && areMirror(a.left, b.left) && (areMirror(a.right, b.right)));
	}
}
