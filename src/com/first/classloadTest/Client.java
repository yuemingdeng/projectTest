package com.first.classloadTest;

import com.first.BinarySearch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        boolean r = task2();
        if (r) {
            task3();
        }

        System.out.println("------------main end-----------");
    }

    static boolean task2() throws InterruptedException {


        asynTask();

        System.out.println("------------task2 end-----------");

        return true;
    }


    static void task3() throws InterruptedException {
        int j = 0;
        while(true) {
            if(j++ > 10000) {
                break;
            }
        }

        System.out.println("------------task3 end-----------");
    }


    public static void asynTask() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(new Runnable() {

            @Override
            public void run() {

                try {
                    Thread.sleep(3000);//方便观察结果
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


               /* int sum = 0;
                for(int i = 0; i < 1000; i++) {

                    sum += i;
                }*/

                int[] array = {1, 2, 4, 5, 7, 9, 7, 11, 21};
                int result =  BinarySearch.binarySearch(array, 4);
                if(result > 0 ) {
                    System.out.println(System.currentTimeMillis()+"..."+Thread.currentThread().getId()+ "...."+"the result > 0");
                }

            }
        });

    }


}









