package com.first;

import java.util.List;
import java.util.Vector;

/**
 * @author yuemingdeng
 * @ time 2018/5/25 1:44
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 7, 9, 7, 11, 21};
        System.out.println(binarySearch(array, 4));

    }


    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (value == array[mid]) {
                return mid;
            } else if (value < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

}
