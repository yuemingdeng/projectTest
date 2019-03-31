package com.first;

import javax.jnlp.IntegrationService;
import java.util.*;

public class LambdaTest {
    public static void main(String[] args) {


        /*List<Integer> list1 = Arrays.asList(1, 10, 8, 9, 2, 3, 4, 5, 6, 7);
        Collections.sort(list1);
        list1.forEach(in -> System.out.println(in));*/

       /* List<String> list = new  ArrayList(Arrays.asList("a", "b",  "b" , "c", "d"));
      *//*  list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");*//*

        for(int i = 0; i < list.size(); i++  ) {
            if("b".equals(list.get(i))) {
                list.remove(i);
            }
        }
*/
      /* for(String ss : list){
           if(ss.equals("b")) {
               list.remove("b");
           }
       }*/


       /* Iterator<String> iterator = list.iterator();
       while(iterator.hasNext()) {
           String element = iterator.next();
           if(element.equals("b")) {
               iterator.remove();
           }

       }*/

      /* List<Integer> list = new ArrayList<>();
       list.add(4);
       list.add(2);
       list.add(1);
       list.add(1);
       list.add(2);

       for(int i = 0; i < list.size(); i++) {
           if(1 == list.get(i)) {
               list.remove(i);

           }
       }*/
      Object object = new Object();
        System.out.println(object);
    }
}


class  SingleInstance {
    private SingleInstance () {}
    private volatile SingleInstance instance;
    public SingleInstance getInstance() {
        if(null == instance){
            synchronized (SingleInstance.class) {
                if(null == instance){
                    instance = new SingleInstance();
                }
            }
        }
        return instance;
    }


}
