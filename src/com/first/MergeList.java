package com.first;

public class MergeList {
	public static void main(String[] args) {
		int a [] = {1,3,4,5,7};
		int[] b = {0,2,6,8,10};
		
//		mergeList(a,b);
//		mergeArray(a,b);
		factorial(0,16);
	}
	
	
	
	
	 public static int[] mergeList(int a[],int b[])
     {
         int result[];  
//             定义一个新数组，长度为两个数组长度之和

         result = new int[a.length+b.length];
           //i:a数组下标    j：b数组下标  k：新数组下标
             int i=0,j=0,k=0;
//             按位循环比较两个数组，较小元素的放入新数组，下标加一（注意，较大元素对应的下标不加一），直到某一个下标等于数组长度时退出循环
             while(i<a.length && j<b.length)
                 if(a[i] <= b[j]) {
                     result[k++] = a[i++];
//                     print(result);
//                     System.out.println(result);
                 }else{
                     result[k++] = b[j++];
                 }
             /* 后面连个while循环是用来保证两个数组比较完之后剩下的一个数组里的元素能顺利传入 *
              * 此时较短数组已经全部放入新数组，较长数组还有部分剩余，最后将剩下的部分元素放入新数组，大功告成*/
             while(i < a.length) 
                 result[k++] = a[i++];
             while(j < b.length)
                 result[k++] = b[j++];
             

             for(int s : result) {
            	 System.out.print(s +",");
             }
             return result;
        }
	 
	 //自己实现
	 public static int [] mergeArray(int []a, int[]b) {
		 int i = 0, j = 0, k = 0;
		 int [] result = new int [a.length + b.length];
		 
		 while(i < a.length && j < b.length) {
			 if(a[i] <= a[j]) {
				 result[k++] = a[i++];
			 } else {
				 result[k++] = a[j++];
			 }
			 
	      while(i < a.length) {
	    	  result[k++] = a[i++];
	      }
	      
	      while(j < b.length) {
	    	  result[k++] = b[j++];
	      }
			 
		 }
		 
		 for(int s: result) {
			 System.out.print(s + ",");
		 }
		 
		 return result;
		 
	 }
	 
	 
	//732 * 16
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
//				array[i] = array[i]%10;
				
			}
			
			for(int ss : array) {
				System.out.print(ss + ",");
			}
		}

}
