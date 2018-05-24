/**
 * 
 */
package com.first;

/**
 * @author yuemingdeng
 *
 */
public class Str1Str2 {
	public static void main(String[] args) {
		String str1 = "adefhdehdkde";
		String str2 = "de";
		count(str1,str2);





	}

	public static int count(String str1, String str2) {
		int count = 0;
		if(str1.length() < str2.length()) {
			return 0;
		}

		for (int i = 0; i < str1.length() - str2.length() +1 ; i++) {
			if (str2.equals(str1.substring(i, i + str2.length()))) {
				count ++;
			}
		}

		System.out.println(count);
		return count;
	}

}
