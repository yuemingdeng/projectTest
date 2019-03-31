package com.first;

/**
 * @author yuemingdeng
 * <p>
 * 饿汉式单例
 */


public class Singleton {
    private Singleton() {
    }

    private volatile static Singleton instance;

    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
