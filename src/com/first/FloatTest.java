package com.first;

import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class FloatTest {
    public static void main(String[] args) {
        System.out.println(1 - 8*.1);
        Executor executor = Executors.newSingleThreadExecutor();

        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("","");
        hashMap.put("1", "ss");
        for(String ss : hashMap.keySet()) {
            System.out.println(ss + "----" + hashMap.get(ss));
        }
    }
}
