package com.first;

public class ArrayListTest {

    private int[] array;
    int size = 0;

    public boolean add(int e) {
        if (size + 1 < array.length) {
            array[size + 1] = e;
        } else {
            //todo 扩容
        }
        return true;
    }

    public int get(int i) {
        return array[i];
    }

    public int getSize() {
        return array.length;
    }

    public boolean remove(Object o) {
        return false;
    }
}
