package collections.tree.binaryTree;

import java.util.HashMap;
import java.util.Map;

public class RightAndLeftViewBinaryTree {

    static Map<Integer, Integer> rightMap = new HashMap<>();
    static Map<Integer, Integer> leftMap = new HashMap<>();
    
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(7);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.left.left = new Node(5);
        System.out.println("Inorder traversal of balanced BST is :");
        tree.inOrderTravesal(tree.root, true);
        leftView(tree.root, leftMap,1);
        System.out.println("after fetching view ");
        leftMap.values().stream().forEach(System.out::println);
        
        // similary call the right view 
    }
    public void rightView(Node node, Map<Integer, Integer> map, Integer level) {
        if (node == null) {
            return;
        }
        map.put(level, node.data);
        rightView(node.left, map, level);
        rightView(node.right, map, level);
    }

    public static void leftView(Node node, Map<Integer, Integer> map, int level) {
        if (node == null)
            return;
        map.put(level, node.data);
        leftView(node.right, map, level + 1);
        leftView(node.left, map, level + 1);
    }
}

