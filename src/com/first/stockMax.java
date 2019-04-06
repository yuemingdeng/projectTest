package com.first;

import java.util.Arrays;

public class stockMax {

    public static void main(String[] args) {
       /* String[] array = {"orange", "Pear", "Apple"};
        Arrays.sort(array, String::compareToIgnoreCase);
        for (String ss : array) {
            System.out.println(ss);
        }*/


        /*new Thread(() -> { A a = new A();a.method(); }).start();
        new Thread(() -> { A b = new A();b.method(); }).start();*/

        for(String ss : args ) {
            System.out.println(ss);
        }


    }


}


class A {
    public synchronized void method() {/**/}
}


