package collections.map.implementation;

import java.util.ArrayList;

class MapImplementation<K, V> {
    class MapNode<K, V> {
        K key;
        V value;
        MapNode<K, V> next;

        public MapNode(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }

    ArrayList<MapNode<K, V>> buckets;
    int size;
    int capacity;
    final double DEFAULT_LOAD_FACTOR = 0.75;

    public MapImplementation(int capacity) 
        { 
            this.capacity = capacity; 
            buckets = new ArrayList<>(capacity); 
            for (int i = 0; i < capacity; i++) { 
                buckets.add(null); 
            } 
            System.out.println("HashMap created"); 
            System.out.println("Number of pairs in the Map: " + size); 
            System.out.println("Size of Map: " + capacity); 
            System.out.println("Default Load Factor : " + DEFAULT_LOAD_FACTOR + "\n"); 
        }

    private int getBucketInd(K key) {
        int hashCode = key.hashCode();
        return (hashCode % capacity);
    }

    public void insert(K key, V value) {
        int bucketInd = getBucketInd(key);
        MapNode<K, V> head = buckets.get(bucketInd);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        MapNode<K, V> newElementNode = new MapNode<K, V>(key, value);
        head = buckets.get(bucketInd);
        newElementNode.next = head;
        buckets.set(bucketInd, newElementNode);

        System.out.println("Pair(" + key + ", " + value + ") inserted successfully.\n");
        size++;

        double loadFactor = (1.0 * size) / capacity;

        System.out.println("Current Load factor = " + loadFactor);

        if (loadFactor > DEFAULT_LOAD_FACTOR) {
            System.out.println(loadFactor + " is greater than " + DEFAULT_LOAD_FACTOR);
            System.out.println("Therefore Rehashing will be done.\n");
            rehash();
            System.out.println("New Size of Map: " + capacity + "\n");
        }

        System.out.println("Number of pairs in the Map: " + size);
        System.out.println("Size of Map: " + capacity + "\n");
    }

    private void rehash() {
        System.out.println("\n***Rehashing Started***\n");
        ArrayList<MapNode<K, V>> newBucketList = buckets;
        buckets = new ArrayList<MapNode<K, V>>(2 * capacity);

        for (int i = 0; i < 2 * capacity; i++) {
            buckets.add(null);
        }
        size = 0;
        capacity *= 2;
        for (int i = 0; i < newBucketList.size(); i++) {
            MapNode<K, V> head = newBucketList.get(i);
            while (head != null) {
                K key = head.key;
                V val = head.value;
                insert(key, val);
                head = head.next;
            }
        }
        System.out.println("\n***Rehashing Ended***\n");
    }

    public V get(K key) {
        int bucket = getBucketInd(key);
        MapNode<K, V> head = buckets.get(bucket);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
        }
        return null;
    }

    public void printMap() {

        ArrayList<MapNode<K, V>> temp = buckets;
        System.out.println("Current HashMap:");
        for (int i = 0; i < temp.size(); i++) {
            MapNode<K, V> head = temp.get(i);
            while (head != null) {
                System.out.println("key = " + head.key + ", val = " + head.value);
                head = head.next;
            }
        }
        System.out.println();
    }
}
