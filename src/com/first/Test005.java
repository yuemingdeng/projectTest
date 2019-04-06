package com.first;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test005 {
   public static List<List<Integer>> getLevelTravel(TreeNode node) {
       List<List<Integer>> list = new LinkedList<>();
       Queue <TreeNode> queue = new LinkedList<>();
       queue.offer(node);
       if(null == node) {
           return list;
       }

       while(!queue.isEmpty()) {
           List<Integer>list1 = new LinkedList();
           for(int i = 0; i < queue.size(); i++) {
               if(null != queue.peek().leftNode) list1.add(queue.peek().leftNode.value);
               if(null != queue.peek().rightNode) list1.add(queue.peek().rightNode.value);
               list1.add(queue.poll().value);
           }
           list.add(list1);

       }

       return list;

   }




}

class TreeNode{
    TreeNode leftNode;
    TreeNode rightNode;
    int value;
}
