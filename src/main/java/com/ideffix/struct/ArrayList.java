package com.ideffix.struct;

public class ArrayList<T> implements List<T>{

    private int size = 0;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T value) {

    }

    @Override
    public void insert(T value, int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public boolean remove(T value) {
        return false;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public boolean contains(T value) {
        return false;
    }
}
