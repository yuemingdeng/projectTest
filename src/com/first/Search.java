/**
 * 
 */
package com.first;

/**
 * @author yuemingdeng
 *
 */
public class Search {
	public static void main(String[] args) {
		int a[] = {1,2,3,5,6,8,9,10,15,16,26,30};
		System.out.println(sort(a,30));
	}
	
	
	public static int sort(int [] a, int value) {
		int low = 0, high = a.length - 1, mid = 0;
		while(low <= high) {
			mid = (low + high) >> 1;
		    if (a[mid] == value) {
		    	return mid;
		    } else if (a[mid] > value) {
		    	high = mid - 1;
		    	
		    } else {
		    	low = mid + 1;
		    }
		}
		
		return -1;
		
	}

}
