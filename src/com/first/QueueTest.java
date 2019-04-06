package com.first;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueTest {

    public static List<List<Integer>> getTravel(TreeNode node) {
        List<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(node != null) {
            queue.offer(node);
        }

        while(!queue.isEmpty()) {
            List<Integer> list1 = new LinkedList<>();
            for(int i = 0; i < queue.size(); i++) {
                if(queue.peek().leftNode != null) list1.add(queue.peek().leftNode.value);
                if(queue.peek().rightNode != null) list1.add(queue.peek().rightNode.value) ;
                list1.add(queue.poll().value);
            }
            list.add(list1);

        }
        return list;
    }

    class TreeNode{
        TreeNode leftNode;
        TreeNode rightNode;
        Integer value;
    }


    public static int get(int[] array, int key) {
        int low =0, high = array.length -1;
        while(low <=high) {
            int mid = (low + high) >>1;
            if(array[mid] > key) {
                high = mid -1;
            } else if(array[mid] < key) {
                low = mid +1;
            } else  {
                return  mid;
            }
        }

        return  -1;

    }

    public static void main(String[] args) {
        int [] array = {1,2,2,2,2,2,3,4,4,4,4,4,5,6,7,8,10};
        System.out.println(commonBinarySearch(array, 2));
//        System.out.println(commonBinarySearch(array, 9));

    }


    /**
     * 不使用递归的二分查找
     *title:commonBinarySearch
     *@param arr
     *@param key
     *@return 关键字位置
     */
    public static int commonBinarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if (arr[mid] == key && arr[mid - 1] != key)
            {
                return mid;
            }
            else if (arr[mid] >= key)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return -1;
    }

}
