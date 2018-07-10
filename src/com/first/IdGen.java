package com.first;

import java.util.UUID;

public class IdGen {
    public static void main(String[] args) {
        for(int i = 0 ; i < 10;i++) {
            String uuid = java.util.UUID.randomUUID().toString();
            System.out.println(uuid);

        }

    }
}
