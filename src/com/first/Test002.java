package com.first;

import java.util.ArrayList;

public class Test002 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        System.out.println(list.getClass());

        System.out.println(list.getClass() == list1.getClass());

    }
}




