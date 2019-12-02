package collections.cache;

import java.util.HashMap;
import java.util.Map;

class Node {
    int key;
    int value;
    Node next;
    Node previous;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public class LRU {
        private int capacity;
        private Map<Integer, Node> map = new HashMap<>();
        private Node head = null;
        Node end = null;

        public LRU(int capacity) {
            super();
            this.capacity = capacity;
        }

        public Node get(int key) {
            Node node = null;
            if (map.containsKey(key)) {
                node = map.get(key);
                delete(node);
                addHead(node);
            }
            return node;
        }

        public void put(int k, int v) {
            Node n = null;
            if (map.containsKey(k)) {
                n = map.get(k);
                n.value = v;
                map.put(k, n);
                delete(n);
                addHead(n);
            } else {
                n = new Node(k, v);
                if (capacity <= map.size()) {
                    map.remove(end.key);
                    delete(end);
                    addHead(n);
                    map.put(k, n);
                }
            }
        }

        private void addHead(Node node) {
            if (head != null) {
                head.previous = node;
            }
            node.next = head;
            node.previous = null;
            head = node;
            if (end == null) {
                end = node;
            }
        }

        private void delete(Node node) {
            if (node.previous != null) {
                node.previous.next = node.next;
            } else {
                head = node.next;
            }
            if (node.next != null) {
                node.next.previous = node.previous;
            } else {
                end = node.previous;
            }
        }
    }
}
