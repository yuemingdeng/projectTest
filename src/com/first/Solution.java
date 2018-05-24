/**
 * 
 */
package com.first;

/**
 * @author yuemingdeng
 *
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
    	boolean flag = false;
        for(int i = 0;i < array.length; i++){
            for(int j = 0; j < array[i].length; j++) {
                if(target == array[i][j]){
                    flag = true;
                }
            }
        }
        return flag;

    }
    
}