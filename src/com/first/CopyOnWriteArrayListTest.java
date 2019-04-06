package com.first;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;

public class CopyOnWriteArrayListTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<>();
        arrayList.add(-1);
        arrayList.add(-2);
        Test1 test1 = new Test1(arrayList,countDownLatch );
        Test2 test2 = new Test2(arrayList, countDownLatch);
        test2.start();
        test1.start();

       /* countDownLatch.await();

        System.out.println("最终结果");
        for (int i : arrayList)  {
            System.out.println(i);
        }*/





    }

}


class Test1 extends  Thread{
    Test1() { }
    Test1(CopyOnWriteArrayList<Integer> arrayList, CountDownLatch countDownLatch) {
        this.arrayList = arrayList;
    }
    CopyOnWriteArrayList<Integer> arrayList = null;
    CountDownLatch countDownLatch;

    @Override
    public void run () {
        for (Integer value : arrayList) {
            System.out.println("value :" + value);
        }

        countDownLatch.countDown();
    }


}

class Test2 extends  Thread{
    Test2() { }
    Test2(CopyOnWriteArrayList<Integer> arrayList , CountDownLatch countDownLatch) {
        this.arrayList = arrayList;
    }
    CopyOnWriteArrayList<Integer> arrayList = null;
    CountDownLatch countDownLatch;

    @Override
    public void run () {
        for (int i = 0; i < 500; i++) {
            arrayList.add(i);
        }
        countDownLatch.countDown();
    }

}
