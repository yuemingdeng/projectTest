package com.first;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> future = executor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("call");
                TimeUnit.SECONDS.sleep(1);
                return "str";
            }
        });
        System.out.println(future.get());
    }

}
