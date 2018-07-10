package com.first;

import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.first.ThreadTest002.count;

public class ThreadTest002 implements Computable <Double, Double>{
    public   static volatile int count = 0;
    public static void main(String[] args) throws InterruptedException {
        Xiancheng xiancheng1 = new Xiancheng("thread1");
        Xiancheng xiancheng2 = new Xiancheng("thread2");
        xiancheng1.start();
        xiancheng2.start();
        xiancheng1.join();
        xiancheng2.join();
        System.out.println("主线程结束" + xiancheng1.isAlive());


    }


    @Override
    public Double compute(Double arg) throws Exception {
        return null;
    }
}


interface Computable<A, V> {
    V compute(A arg) throws Exception;
}


class Xiancheng extends Thread{
    private  String name;
    Xiancheng( String name){
        this.name = name;
    }
    @Override
    public  void run () {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程"+name + "运行 : " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
