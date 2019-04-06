/**
 * 
 */
package com.first;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author yuemingdeng
 *
 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		
		num("D:\\001.txt","yuemingd");
		
	}
	
	public static int num(String src , String str) throws IOException{
		int counter = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(src)) );
		String line = null;
		while(null != (line = reader.readLine())){
			int index = -1;
			while(line.length() >= str.length() && (index = line.indexOf(str)) >= 0){
				counter++;
                line = line.substring(index + str.length());
			}
			
			
			
		}
		System.out.println(counter);
		return counter;
		
	}

	public  void getfine() {

	}
	
	

}
