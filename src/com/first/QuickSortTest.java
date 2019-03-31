package com.first;

public class QuickSortTest {

    public static void main(String[] args) {
        int[] array = {4, 7, 6, 5, 3, 2, 8, 1, 10, -11};

        int[] result = quickSort(array, 0, array.length - 1);
        for (int ss : result) {
            System.out.println(ss);
        }


    }

    public static int[] quickSort(int[] array, int left, int right) {
        int i, j;
        if (left < right) {
            i = left;
            j = right + 1;
            do {
                do i++; while (array[i] < array[left]);
                do j--; while (array[j] > array[left]);
                if (i < j) {
                    swap(array, i, j);
                }
            } while (i < j);

            swap(array, left, j);
            quickSort(array, left, j - 1);
            quickSort(array, j + 1, right);

        }

        return array;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
