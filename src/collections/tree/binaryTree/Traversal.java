package collections.tree.binaryTree;

public class Traversal {

	public void levelOrderTraversal(Node node) {
		int level = 1;
		while (printLevel(node, level)) {
			level++;
		}
	}

	private boolean printLevel(Node node, int level) {
		if (node == null) {
			return false;
		}
		if (level == 1) {
			System.out.println(node.data + " ");
			return true;
		}
		boolean left = printLevel(node.left, level - 1);
		boolean right = printLevel(node.right, level - 1);
		return left || right;
	}

	public void spiralOrderTraversal(Node node) {
		int level = 1;
		while (printLeftToRightLevel(node, level++) && printRightToLeftLevel(node, level++))
			;
	}

	private boolean printRightToLeftLevel(Node node, int level) {
		if (node == null) {
			return false;
		}
		if (level == 1) {
			System.out.println(node.data + " ");
			return true;
		}
		boolean right = printRightToLeftLevel(node.right, level - 1);
		boolean left = printRightToLeftLevel(node.left, level - 1);
		return left || right;
	}

	private boolean printLeftToRightLevel(Node node, int level) {
		if (node == null) {
			return false;
		}
		if (level == 1) {
			System.out.println(node.data + " ");
			return true;
		}
		boolean left = printLeftToRightLevel(node.left, level - 1);
		boolean right = printLeftToRightLevel(node.right, level - 1);
		return left || right;
	}
}
