package com.first;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ArrayTest {
    public static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
       /* int array[] = {-1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(brinchSearch(array, 3));*/

        /*int array[] = {};
        bubbleSort(array);*/

        /*Object []array1 = {1,2,3,4,5,6};
        Object []array2 = {1,2,3,4,5,6,7,8,9,10};

        List list = new ArrayList();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    list.add(array1[i]);
                }
            }
        }

        System.out.println(list);*/

        System.out.println(count(0111111001));


    }

    static int count(int v) {
        int num = 0;
        while (v != 0) {
            if (v % 2 == 1) {
                num++;
            }
            v = v / 2;
        }

        return num;
    }

    public static int brinchSearch(int[] array, int key) {
        int i = 0;
        int j = array.length - 1;
        while (i <= j) {
            int mid = (i + j) >> 1;
            if (key == array[mid]) {
                return mid;
            } else if (key < array[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }


    public static int[] bubbleSort(int array[]) {
        if (array != null && array.length == 0) {
            int empty[] = new int[0];
            return empty;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int ss : array) {
            System.out.println(ss);
        }
        return array;
    }

    public static Object[] intersection(Object[] strOne, Object[] strTwo) {
        HashSet<Object> set = new HashSet<>(Arrays.asList(strOne));
        set.retainAll(Arrays.asList(strTwo));
        return set.toArray();
    }

   /* public int[] intersection1(int[] nums1, int[] nums2) {
        HashSet<Object> set = new HashSet<>(Arrays.asList(nums1));
        set.retainAll(Arrays.asList(nums2));
        Object[] result = set.toArray();
    }*/


    public static int getProfit(int[] array) {
        int profit = 0;
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
            int value = array[i] - minValue;
            if (value > profit) {
                profit = value;
            }
        }
        return profit;
    }


}
