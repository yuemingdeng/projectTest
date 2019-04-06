package com.first;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetTest {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet();
        copyOnWriteArraySet.add(1);
        copyOnWriteArraySet.add(2);
        copyOnWriteArraySet.add(3);
        copyOnWriteArraySet.add(3);

        for (int i : copyOnWriteArraySet) {
            System.out.println(i);
        }

    }



}
