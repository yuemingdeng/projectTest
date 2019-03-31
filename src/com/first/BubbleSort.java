package com.first;

/**
 * @author yuemingdeng
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 12, 8, 5, 1, 6, 8, 2, 0, 56, 5};
        bubbleSort(array);

        System.out.println(bubbleSort(array));






    }


    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;

    }

}
