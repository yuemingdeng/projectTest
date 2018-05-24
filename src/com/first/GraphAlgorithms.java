package com.first;

/**
 * Classname GraphAlgorithms
 * author yuemingdeng
 * Version 1.0.0
 * Date 2017-11-05
 *
 */

public class GraphAlgorithms {
    public static String bestPath = "";
    public static int bestCost = Integer.MAX_VALUE;
    public static final int[][] map = { 
            {-1, 5, -1, 5, 7}, 
            {-1, -1, 4, -1, -1},
            {-1, -1, -1, 8, 2},
            {-1, -1, 8, -1, 6},
            {-1, 3, -1, -1, -1},
    };
    
	 public static void main(String[] args) {
		 	System.out.println("问题6：");
		 	GraphAlgorithms.dfs("C", "C", 3);//问题6
		 	
	    	System.out.println("问题7：");
	    	GraphAlgorithms.dfs07("C", "A", 4);//问题7
	    	
	    	System.out.println("问题8：");
	    	GraphAlgorithms.dfs08("C", "A", 0); // 问题8
	    	System.out.println("Best Path: " + bestPath + "\nCost: " + bestCost);
	    	
	    	System.out.println("问题9：");
	    	bestPath = "";
	    	bestCost = Integer.MAX_VALUE;
	    	GraphAlgorithms.dfs08("B", "B", 0); // 问题9
	        System.out.println("Best Path: " + bestPath + "\nCost: " + bestCost);
	        
	        System.out.println("问题10：");
	        GraphAlgorithms.dfs10("C", "C", 0);
	    	
	    	
	    	
	    }
    
	/**问题6
	 * dfs
	 * @param end
	 * @param path
	 * @param maxLength
	 * @return
	 */
    public static void dfs(String end, String path, int maxLength)
    {
        if (path.length() - 1 > maxLength) return;
        
        if ( path.length() > 1 && path.endsWith(end) ) {
            System.out.println(path + ", " + (path.length() - 1));
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
    
    /**问题7
	 * dfs07
	 * @param end
	 * @param path
	 * @param length
	 * @return
	 */
    public static void dfs07(String end, String path, int length)
    {
        if (path.length() - 1 > length) return;
        
        if ( ((path.length() -1) == length) && path.endsWith(end) ) {
            System.out.println(path + ", " + (path.length() - 1));
        }
        
        char lastChar = path.charAt(path.length()-1);
        int lastNodeIndex = lastChar - 'A';
        
        for ( int i=0; i<map[lastNodeIndex].length; i++ )
        {
            char newChar = (char)(i + 'A');
            if ( map[lastNodeIndex][i] > 0) {
            	dfs07(end, path + newChar, length);
            }
        }
    }

    
    /**问题8,9
	 * dfs08
	 * @param end
	 * @param path
	 * @param cost
	 * @return
	 */
    public static void dfs08(String end, String path, int cost) {
        if (path.endsWith(end) && cost < bestCost && cost > 0) {
            bestPath = path;
            bestCost = cost;
            return;
        }
        char lastChar = path.charAt(path.length() - 1);
        int lastNodeIndex = lastChar - 'A';
        for (int i = 0; i < map[lastNodeIndex].length; i++) {
            char newChar = (char) (i + 'A');
            int newCost = map[lastNodeIndex][i];
            if (newCost > 0) {
                if (path.indexOf(newChar) > 0)
                    continue;
                dfs08(end, path + newChar, cost + newCost);
            }
        }
    }
    
    /**问题10
	 * dfs10
	 * @param end
	 * @param path
	 * @param cost
	 * @return
	 */
    public static void dfs10(String end, String path, int cost) {
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
            	dfs10(end, path + newChar, cost + newCost);
            }
        }
    }
    
}
