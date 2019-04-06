package com.first;

public class Test006 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Singleton1.getInstance());
        }
    }



}

class Singleton1 {
    private Singleton1() { }

    private static class SingletonHolder {
        private  static Singleton1 singleton = new Singleton1();
    }

    public static Singleton1 getInstance() {
        return SingletonHolder.singleton;
    }
}
