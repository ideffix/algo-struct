package com.ideffix.struct;

class LinkedListTest extends ListTest {

    @Override
    protected List<Integer> createEmptyList() {
        return new LinkedList<>();
    }
}
