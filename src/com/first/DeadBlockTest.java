package com.first;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadBlockTest extends Thread {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorServer = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int index = i;
            sleep(index * 1000);
            executorServer.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                }

            });
        }

    }

}
