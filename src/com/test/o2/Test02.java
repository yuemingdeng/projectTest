/**
 * 
 */
package com.test.o2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yuemingdeng
 *
 */

	
	

import com.test.o2.Test02;

/**
 * @author yuemingdeng
 *
 */
public class Test02 {
    public static int[][] map = { 
            {-1, 5, -1, 5, 7}, 
            {-1, -1, 4, -1, -1},
            {-1, -1, -1, 8, 2},
            {-1, -1, 8, -1, 6},
            {-1, 3, -1, -1, -1},
    };
    
	 public static void main(String[] args) {
		 	
		 Test02 g = new Test02();
	        g.dfs("C", "C", 0);
	    	
	    }
    
	
    public void dfs(String end, String path, int cost) {
        if (cost >= 30)
            return;
        if (cost > 0 && path.endsWith(end)) {
            System.out.println(path + ", " + cost);
        }
        char lastChar = path.charAt(path.length() - 1);
        int lastNodeIndex = lastChar - 'A';
        for (int i = 0; i < map[lastNodeIndex].length; i++) {
            char newChar = (char) (i + 'A');
            int newCost = map[lastNodeIndex][i];
            if (newCost > 0) {
                dfs(end, path + newChar, cost + newCost);
            }
        }
    }
    
   
}
