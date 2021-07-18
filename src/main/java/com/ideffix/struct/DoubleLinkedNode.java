package com.ideffix.struct;

public class DoubleLinkedNode<TValue> extends Node<TValue> {
    private Node<TValue> prev;

    public DoubleLinkedNode(TValue value) {
        super(value);
    }

    public Node<TValue> getPrev() {
        return prev;
    }

    public void setPrev(Node<TValue> prev) {
        this.prev = prev;
    }
}
