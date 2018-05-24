package com.first;

public class Factorial {

	
	
	
	//732 * 16  数组方式运算
	public static void factorial (int num1, int num2) {
		int [] array = new int [5];
		array[array.length - 1] = 2;
		array[array.length - 2] = 3;
		array[array.length - 3] = 7;
		
		// 将num1数组每一位乘以16放回数组原位置
		for(int i = 0; i < array.length; i ++) {
			array[i] *= num2; 
		}
		
		for(int i = array.length -1; i > 0; i--) {
			array[i-1] +=array[i]/10;
			array[i] = array[i]%10;
			
		}
		
		for(int ss : array) {
			System.out.print(ss + ",");
		}
	}
	
	
	/**
	 * 冒泡排序
	 * 注意第二重循环范围
	 */
	public static int [] bubbloSort(int [] array) {
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j+1]) {
					int mid = array[j];
					array[j] = array[j+1];
					array[j+1] = mid;
				}
			}
		}
		
		for(int ss : array) {
			System.out.print(ss + ",");
		}
		
		return array;
		
	}
	
	/**
	 * 二分查找
	 * 注意mid是放在循环内部
	 */
	public static int binarySearch(int a[], int key) {
		int low = 0, high = a.length - 1;
		int mid;
		
		while(low <= high) {
			mid = (low + high)/2;
			if(key == a[mid]) {
				System.out.println(mid);
				return mid;
			}
			
			if(key < a[mid]) {
				high = mid - 1;
			} else if (key > a[mid]) {
				low = mid + 1;
			}
		}
		return -1;
		
	}
	
	
	/**
	 * 插入排序
	 * 时间复杂度高
	 */
	public static int [] insertSort(int a []) {
		for (int i = 1; i <= a.length -1; i++) {
			if(a[i] < a[i - 1]) {
				for(int j = 0; j < i; j++) {
					if(a [i] < a[j]) {
						int temp = a[i];
						for(int k = i - 1; k >= j; k --) {
							a[k + 1] = a [k];
						}
						
						a[j] = temp;
						break;
					}
					
				}
				   
			     }
			
			
		     }
		
		for(int ss: a) {
			System.out.print(ss +",");
			
		}
		
		return a;
		
	}
	
	/**
	 * 插入排序
	 * 改进
	 */
	
	public static int[] insertSortBetter(int array[]) {
		for(int i = 1; i <= array.length - 1; i++) {
			int temp = array[i];
			while(i > 0 && temp < array[i -1]) {
				array[i] = array[i - 1];
				i--;
				
			}
			
			array[i] = temp;
		}
		
		for(int ss: array) {
			System.out.print(ss + ",");
		}
		
		
		return array;
		
	}
	
    public static void main(String[] args) {
    	
    	int a = 2, b = 5;
    	a = a + b;
    	b = a - b;
    	a = a - b;
    	System.out.println(a + "----" +b);
		
		
		
	}
    
    
    /**
	 * 基金最佳买入点和卖出点
	 * 
	 */
    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length < 1) {
            return 0;
        }

        int min = prices[0];
        int profit = 0;

        // 第i天的价格能够看作是买入价也能够看作是卖出价
        for (int i = 1; i < prices.length; i++) {
            // 找到更低的买入价
            if (min > prices[i]) {
                // 更新买入价
                min = prices[i];
            } 
            // 当天的价格不低于买入价
            else {
                // 假设当天买出的价格比之前卖出的价格高
                if (profit < prices[i] - min) {
                    // 更新卖出价
                    profit = prices[i] - min;
                } 
            }
        }
        
        System.out.println(profit);
        return profit;
        
    }
    
    

}
