package com.first;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestMouse1 {
   /* public static void main(String[] agse) {
        List<Integer> list1 = new LinkedList<Integer>();
        Collections.addAll(list1, 30, 41, 15, 12, 56, 80);
        List<Integer> list2 = new LinkedList<Integer>();
        Collections.addAll(list2, 23, 56, 78, 23, 12, 33, 79, 90, 55);
        test1(list1, list2);
    }

    public static void test1(List<Integer> list1, List<Integer> list2) {
//        list1.removeAll(list2);// list1中删除和list2中交集的元素
        list2.addAll(list1);// 合并
        Collections.sort(list2);
        for (Integer integer : list2) {
            System.out.print(integer + " ");
        }
    }*/


   //首选方法
    public static String reverse2(String s)
    {
        int length = s.length();
        String reverse = "";  //注意这是空串，不是null
        for (int i = 0; i < length; i++)
            reverse = s.charAt(i) + reverse;//在字符串前面连接，  而非常见的后面
        return reverse;
    }

    public static String reverse3(String s)
    {
        char[] array = s.toCharArray(); //将string类型参数转化为char[]类型参数
        String reverse = "";  //注意这是空串，不是null
        for (int i = array.length - 1; i >= 0; i--)
            reverse += array[i];
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse2("haha"));
    }


}
