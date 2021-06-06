package com.magic.datastructures;

public class MyBSTNode<K extends Comparable<K>> {
    K key;
    MyBSTNode<K> left;
    MyBSTNode<K> right;

    public MyBSTNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
