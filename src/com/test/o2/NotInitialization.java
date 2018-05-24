package com.test.o2;




class SuperClass {
    static {
        System.out.println("superclass init");
    }

    public static int value = 123;
}

class SubClass extends SuperClass {
    static {

        System.out.println("suberclass init");
    }
}
public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
