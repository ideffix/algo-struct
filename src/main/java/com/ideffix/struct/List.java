package com.ideffix.struct;

public interface List<T> {
    boolean isEmpty();
    int size();
    void add(T value);
    void insert(T value, int index);
    T get(int index);
    boolean remove(T value);
    void remove(int index);
    boolean contains(T value);
}
