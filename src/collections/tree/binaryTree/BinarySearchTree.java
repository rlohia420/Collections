package collections.tree.binaryTree;

public class BinarySearchTree {

	public boolean isBst(Node node){
		if(node==null)
			return true;
		if(node.left!=null && maxValue(node.left) > node.data)
			return false;
		if(node.right!=null && minValue(node.right) < node.data)
			return false;
		if(!isBst(node.left) || !isBst(node.right)) {
			return false;
		}
		return true;
	}
}
