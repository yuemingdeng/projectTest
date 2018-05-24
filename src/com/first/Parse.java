/**
 * 
 */
package com.first;

import java.util.Arrays;

/**
 * @author yuemingdeng
 *
 */
public class Parse {
	private int []array;
	public Parse() {};
	
	public Parse(int [] array) {
		this.array = array;
		
	}
	
	public static void main(String[] args) {
		int [] a = {5,6,1,2,8,6,4,8,9,3,15,36,96,59,85,25,26,6,14};
		
//		int [] b = quickSort(a,0,a.length - 1);
//		
//		for(int i : b){
//			System.out.print(i + ", ");
//		}
		equilateral();
//		bubbleSort(a);
//		equilateral();
	}
	
	public static int [] bubbleSort(int []array){
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length -1 - i ;j++){
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for(int i : array){
			System.out.print(i + ",");
		}
		return array;
		
	}
	
	
	public static void equilateral() {
		for(int i = 1; i <= 5; i++) { 
			
			for(int j = i ; j < 5; j++) {
				System.out.print(" ");
			}
			
			for(int k = i; k > 0; k--){
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
	}
		
	
	
	public static void sort(int[] a,int low,int high){
        int start = low;
        int end = high;
        int key = a[low];
        
        
        while(start < end){
            //从后往前比较
            while(start < end && key <= a[end])  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if(a[end]<=key){
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while(end>start&&a[start]< key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
               start++;
            if(a[start]>=key){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if(start>low) sort(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
        if(end<high) sort(a,end+1,high);//右边序列。从关键值索引+1到最后一个
    }
    

	
	public static int[] quickSort(int[] a, int left ,int right) {
		int i,j;
		if (left < right) {
			i = left;
			j = right + 1;
		  
			do{
				do i++; while (a[i] < a[left]);
				do j--; while (a[j] > a[left]);
				System.out.println(i+"**"+j);
				if(i < j) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			} while(i < j);
			swap(a,left, j);
			
			quickSort(a, left ,j - 1);
			quickSort(a, j+1 ,right);
	     }
		return a;
	}
	
	
//	Java对普通类型的变量是不支持引用传递的,用下面的方法
	public static void swap(int[] data, int a, int b) {  
        int t = data[a];  
        data[a] = data[b];  
        data[b] = t;  
    }  
		
	

}
