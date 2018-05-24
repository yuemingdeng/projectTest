/**
 * 
 */
package com.first.classloadTest;

/**
 * @author yuemingdeng
 *
 */
public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		MyClassLoader mcl = new MyClassLoader();   
		Class<?> clazz = Class.forName("People", true, mcl);   
		Object obj = clazz.newInstance();  
		         
		System.out.println(obj);  
		System.out.println(obj.getClass().getClassLoader());//打印出我们的自定义类加载器  
	}

}
