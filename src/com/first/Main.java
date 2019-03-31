package com.first;

import java.util.*;

public class Main {


    public static int removeDuplicates1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count++;
                if (count != i) {
                    nums[count] = nums[i];
                }
            }
        }

        for (int ss : nums) {
            System.out.println(ss);
        }
        return count + 1;
    }

    public static int removeDuplicates(int[] nums) {
        if (null == nums || nums.length == 0) return 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) count++;
            nums[i - count] = nums[i];
        }
        return nums.length - count;
    }


    public static int[] sortedSquares(int[] A) {
        if (null == A || A.length == 0) return null;
        int absMinNum = 0;
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (Math.abs(A[absMinNum]) > Math.abs(A[i])) {
                absMinNum = i;
            }
        }
        int j = absMinNum, k = absMinNum + 1;
        int n = 0;
        while (n < A.length) {
            if (j == -1) {
                result[n++] = A[k] * A[k];
                k++;
            } else if (k == A.length) {
                result[n++] = A[j] * A[j];
                j--;
            } else {
                if (Math.abs(A[j]) > Math.abs(A[k])) {
                    result[n++] = A[k] * A[k];
                    k++;
                } else {
                    result[n++] = A[j] * A[j];
                    j--;
                }
            }
        }
        return result;
    }


    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int maxProfit = 0;
        int minValue = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minValue) {
                minValue = prices[i];
            }

            int profit = prices[i] - minValue;
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }


   /* public static int get() {
        try {
            int num = 1/0;
            return 1;
        } catch (Exception e) {
            return -1;
        } finally {
            return 1;
        }
    }*/


    public static int[] sortedSquares1(int[] A) {
        if (null == A || A.length == 0) return null;
        int len = A.length;
        int[] result = new int[len];
        int j = 0, k = len - 1;
        for (int p = len - 1; p >= 0; p--) {
            if (Math.abs(A[j]) < Math.abs(A[k])) {
                result[p] = A[k] * A[k];
                k--;
            } else {
                result[p] = A[j] * A[j];
                j++;
            }
        }

        for (int ss : result) {
            System.out.println(ss);
        }
        return result;
    }



    public static  List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i ++){
            if( i > 0 && nums[i] == nums[i - 1] ) continue;
            int j = i + 1, k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0) {
                    k--;
                }else if(sum < 0) {
                    j ++;
                } else {
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
            }

        }
        return list;

    }


    public static List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i ++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0) {
                    k--;
                }else if(sum < 0) {
                    j ++;
                } else {
                    list.add(Arrays.asList(nums[i], nums[j],nums[k]));
                    while(j < k && nums[j] == nums[j + 1]) j++;
                    while(j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
            }
        }
        return list;

    }


    public static void main(String[] args) {
        /*int[] array = {-4, -1, 0, 3, 10};
        sortedSquares1(array);*/

        int[] array = {-2,0,0,2,2};
        Arrays.sort(array);
        System.out.println(threeSum1(array));

        /*String ss = "abbjdhabcsdabc";
        System.out.println(ss.indexOf("abc"));*/

    }

    public static List<List<Integer>> threeSum2(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }


}
