package Hashes;

import java.util.LinkedList;

public class HashTableByChaining {
    private static class Node {
        int key;
        String value;
        public Node (int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    LinkedList<Node>[] hashTable;
    int count;

    @SuppressWarnings ( "unchecked" )
    public HashTableByChaining(int size) {
        hashTable = new LinkedList[size];
        count = size;
    }

    public void put (int key, String value) {
        var node = new Node (key, value);
        var entry = getValueFromBucket ( key );
        if (entry != null) {
            entry.value = node.value;
            return;
        }

        getOrCreateBucket ( key ).addLast ( node );
    }

    public String get(int key) {
        var node = getValueFromBucket ( key );
        return node == null ? null : node.value;
    }

    public String remove(int key) {
        var node = getValueFromBucket ( key );
        if (node == null)
            throw new IllegalStateException ( );

        getBucket ( key ).remove ( node );
        return node.value;
    }

    private int hash(int key) {
        return key % count;
    }
    private LinkedList<Node> getBucket(int key){
        return hashTable[hash( key )];
    }
    private LinkedList<Node> getOrCreateBucket(int key) {
        var index = hash ( key );
        if (hashTable[index] == null)
            hashTable[index] = new LinkedList<> (  );

        return hashTable[index];
    }
    private Node getValueFromBucket(int key) {
        var bucket = getBucket ( key );

        if (bucket != null) {
            for (var item : bucket) {
                if (item.key == key)
                    return item;
            }
        }

        return null;
    }

}