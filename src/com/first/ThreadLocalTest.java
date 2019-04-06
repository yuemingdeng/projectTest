package com.first;

public class ThreadLocalTest {
    private static final ThreadLocal<Integer> THREAD_LOCAL = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                new Thread(()-> {
                    System.out.println("THREAD_LOCAL 的初始值： " + THREAD_LOCAL.get());
                    for (int i1 = 0; i1 < 10; i1++) {
                        THREAD_LOCAL.set(THREAD_LOCAL.get() + i1);
                    }
                    System.out.println("线程"  + "的累加value:" + THREAD_LOCAL.get());
                }).start();

            }


    }

}
