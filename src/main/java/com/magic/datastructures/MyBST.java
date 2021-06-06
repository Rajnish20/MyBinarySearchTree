package com.magic.datastructures;

public class MyBST<K extends Comparable<K>> {

    private MyBSTNode<K> root = null;

    public void addNodes(K key) {
        this.root = add(root, key);
    }

    public MyBSTNode<K> add(MyBSTNode<K> rootNode, K key) {
        if (rootNode == null) {
            return new MyBSTNode<K>(key);
        }
        int compareResult = rootNode.key.compareTo(key);
        if (compareResult == 0)
            return rootNode;
        if (compareResult > 0)
            rootNode.left = add(rootNode.left, key);
        else
            rootNode.right = add(rootNode.right, key);
        return rootNode;
    }

    public int getSize() {
        return size(this.root);
    }

    public int size(MyBSTNode<K> rootNode) {
        if (rootNode == null)
            return 0;
        return 1 + size(rootNode.left) + size(rootNode.right);
    }

    public boolean searchKey(K key) {
        return search(this.root, key);
    }

    public boolean search(MyBSTNode<K> rootNode, K key) {
        if (rootNode == null)
            return false;
        if (rootNode.key.equals(key))
            return true;
        int compareResult = rootNode.key.compareTo(key);
        if (compareResult > 0)
            return search(rootNode.left, key);
        else
            return search(rootNode.right, key);
    }
}
