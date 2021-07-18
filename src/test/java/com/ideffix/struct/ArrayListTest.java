package com.ideffix.struct;


class ArrayListTest extends ListTest {

    @Override
    protected List<Integer> createEmptyList() {
        return new ArrayList<>();
    }
}