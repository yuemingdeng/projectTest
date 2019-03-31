package com.first.redisTest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolExecutor {

    private static int produceTaskSleepTime = 2;
    private static int consumeTaskSleepTime = 2000;
    private static int produceTaskMaxNumber = 10;

    public static void main(String[] args) {


        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(8,10,1000, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(3));
        for(int i=1;i<=produceTaskMaxNumber;i++){
            try {
                //产生一个任务，并将其加入到线程池
                String task = "task@ " + i;
                System.out.println("put " + task);
                threadPool.execute(new ThreadPoolTask(task));
                //便于观察，等待一段时间
                Thread.sleep(produceTaskSleepTime);
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }

    /**
     * 线程池执行的任务
     */
    private static class ThreadPoolTask implements Runnable {
        private static final long serialVersionUID = 0;
        //保存任务所需要的数据
        private Object threadPoolTaskData;

        public ThreadPoolTask(Object tasks) {
            this.threadPoolTaskData = tasks;
        }
        public void run() {
            //处理一个任务，这里的处理方式太简单了，仅仅是一个打印语句
            System.out.println("start .." + threadPoolTaskData);

            if(threadPoolTaskData.equals("task@ 1")){
                System.out.println( threadPoolTaskData );
                //如果线程池中某个线程出现异常会怎样？
                Thread.currentThread().interrupt();
            }
            try {
                ////便于观察，等待一段时间
                Thread.sleep(consumeTaskSleepTime);

            } catch (Exception e) {
                e.printStackTrace();
            }
            threadPoolTaskData = null;
        }
        public Object getTask(){
            return this.threadPoolTaskData;
        }
    }

}


