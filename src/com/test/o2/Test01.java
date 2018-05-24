/**
 * 
 */
package com.test.o2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
    public int[][] map = { 
            {-1, 5, -1, 5, 7}, 
            {-1, -1, 4, -1, -1},
            {-1, -1, -1, 8, 2},
            {-1, -1, 8, -1, 6},
            {-1, 3, -1, -1, -1},
    };
    
    public void dfs(String end, String path, int maxLength)
    {
        if (path.length() - 1 > maxLength) return;
        
        if ( path.length() > 1 && path.endsWith(end) ) {
            System.out.println(path + ", " + path.length());
        }
        
        char lastChar = path.charAt(path.length()-1);
        int lastNodeIndex = lastChar - 'A';
        
        for ( int i=0; i<map[lastNodeIndex].length; i++ )
        {
            char newChar = (char)(i + 'A');
            if ( map[lastNodeIndex][i] > 0) {
                dfs(end, path + newChar, maxLength);
            }
        }
    }
    
    public static void main(String[] args) {
        Test01 g = new Test01();
        
        g.dfs("C", "C", 3);
    }
}