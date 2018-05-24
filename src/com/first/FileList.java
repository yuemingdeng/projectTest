/**
 * 
 */
package com.first;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * @author yuemingdeng
 *
 */
public class FileList {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		fileList("D:\\Workspaces\\resume");
		
		String ss = "sjdhs";
		Method method = ss.getClass().getMethod("toUpperCase");
		
		System.out.println(method.invoke(ss));
		
	}
	
    
	
	
	public static File[] fileList(String src){
		File file = new File(src);
		File [] list = file.listFiles();
		StringBuffer str1 = new StringBuffer();
		
		for(File ss : list) {
			if(ss.isFile())
			System.out.println(ss);
		}
		
		
		
		return list;
		
	}
	
	//饿汉式单例
	class SingleInstance {
		SingleInstance(){}
		private SingleInstance instance = null;
		public SingleInstance getInstance() {
			instance = new SingleInstance();
			return instance;
			
		}
		
		
	}
}
