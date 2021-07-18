package com.ideffix.struct;

public class Node<TValue> {
    private Node<TValue> next;
    private TValue value;

    public Node(TValue value) {
        this.value = value;
    }

    public Node<TValue> getNext() {
        return next;
    }

    public void setNext(Node<TValue> next) {
        this.next = next;
    }

    public TValue getValue() {
        return value;
    }

    public void setValue(TValue value) {
        this.value = value;
    }
}
