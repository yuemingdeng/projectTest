package com.first;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrierTest {
    public static void main(String[] args) throws InterruptedException {
        int N = 4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N,  new Runnable() {
                @Override
                public void run () {
                    System.out.println("当前线程："+ Thread.currentThread().getName());
        }
        });
        for (int i = 0; i < N; i++) {
                new Writer(cyclicBarrier).start();

            }

        Thread.sleep(35000);

        for (int i = 0; i < N; i++) {
            new Writer(cyclicBarrier).start();
        }

    }


}

 class Writer extends Thread{
    private CyclicBarrier cyclicBarrier;
    public Writer(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }
    @Override
    public void run() {
        System.out.println("线程"+Thread.currentThread().getName()+"正在写入数据...");
        try {
            Thread.sleep(5000);      //以睡眠来模拟写入数据操作
            System.out.println("线程"+Thread.currentThread().getName()+"写入数据完毕，等待其他线程写入完毕");
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch(BrokenBarrierException e){
            e.printStackTrace();
        }
        System.out.println("所有线程写入完毕，继续处理其他任务...");
//        count();
    }



    public int count() {
        System.out.println(12);
        return 12;
    }
}
