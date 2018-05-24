package com.first;

/**
 * @author yuemingdeng
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 7, 9, 10, 21};
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
