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
//             ����һ�������飬����Ϊ�������鳤��֮��

         result = new int[a.length+b.length];
           //i:a�����±�    j��b�����±�  k���������±�
             int i=0,j=0,k=0;
//             ��λѭ���Ƚ��������飬��СԪ�صķ��������飬�±��һ��ע�⣬�ϴ�Ԫ�ض�Ӧ���±겻��һ����ֱ��ĳһ���±�������鳤��ʱ�˳�ѭ��
             while(i<a.length && j<b.length)
                 if(a[i] <= b[j]) {
                     result[k++] = a[i++];
//                     print(result);
//                     System.out.println(result);
                 }else{
                     result[k++] = b[j++];
                 }
             /* ��������whileѭ����������֤��������Ƚ���֮��ʣ�µ�һ���������Ԫ����˳������ *
              * ��ʱ�϶������Ѿ�ȫ�����������飬�ϳ����黹�в���ʣ�࣬���ʣ�µĲ���Ԫ�ط��������飬�󹦸��*/
             while(i < a.length) 
                 result[k++] = a[i++];
             while(j < b.length)
                 result[k++] = b[j++];
             

             for(int s : result) {
            	 System.out.print(s +",");
             }
             return result;
        }
	 
	 //�Լ�ʵ��
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
			
			// ��num1����ÿһλ����16�Ż�����ԭλ��
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
