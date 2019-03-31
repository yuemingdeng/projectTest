package com.first.redisTest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadTest {
    private static int produceTaskSleepTime = 1000;
    private static int consumeTaskSleepTime = 200;
    private static int produceTaskMaxNumber = 100;

    public static void main(String[] args) throws InterruptedException {

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
        for (int i = 1; i <= produceTaskMaxNumber; i++) {
            threadPool.submit(new ThreadPoolTask(i));
            Thread.sleep(50);
        }
        threadPool.shutdown();
    }


   static class ThreadPoolTask implements Runnable {
        private static final long serialVersionUID = 0;
        //保存任务所需要的数据
        private int threadPoolTaskData;

        public ThreadPoolTask(int tasks) {
            this.threadPoolTaskData = tasks;
        }

        public void run() {
            //处理一个任务，这里的处理方式太简单了，仅仅是一个打印语句
            System.out.println(Thread.currentThread().getName() + "    start .." + threadPoolTaskData);
            try {
                if (threadPoolTaskData % 10 == 0) {
                    System.out.println(threadPoolTaskData + "异常：   " + threadPoolTaskData);
                    //如果线程池中某个线程出现异常会怎样？
                    int j = threadPoolTaskData/0;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            threadPoolTaskData = 0;
        }
    }

}
