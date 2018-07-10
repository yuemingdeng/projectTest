package com.first.classloadTest;

public class WebTest {
    public static void main(String[] args) {
       /* int a [] = {3,2,3,1,2,3};
        System.out.println(maxProfit(a));*/
        System.out.println(trailingZeros(26));

    }



        /**
         * @param
         * @param prices: An integer array
         * @return: Maximum profit
         */
        public static int maxProfit(int[] prices) {
            // write your code here
            int result = 0;
            for(int i = 1; i < prices.length; i ++) {
                if(prices[i] > prices[i-1]) {
                    result += prices[i]- prices[i - 1];
                }
            }
            return result;
        }


    public static long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long count = 0;
        long temp = n/5;
        while(temp != 0){
            count = count+temp;
            temp = temp/5;
        }
        return count;
    }


}
