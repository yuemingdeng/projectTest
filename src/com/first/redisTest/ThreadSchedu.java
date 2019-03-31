package com.first.redisTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSchedu {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new A());
        Thread b = new Thread(new B());
        Thread c = new Thread(new C());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(a);
        executorService.submit(b);
        executorService.submit(c);

    }

}

class A implements Runnable {
    @Override
    public void run () {
        System.out.println("线程 A");

    }
}

class B implements Runnable  {
    @Override
    public void run () {
        System.out.println("线程 B");

    }
}


class C implements Runnable  {
    @Override
    public void run () {
        System.out.println("线程 C");

    }
}
