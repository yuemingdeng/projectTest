/**
 * 
 */
package com.first;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yuemingdeng
 *
 */
public class RefectTest {
	static int [] a = {5,6,1,2,8,6,4,8,9,3,15,36,96,59,85,25,26,6,14};
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("com.first.Parse");
		Constructor cons = clazz.getDeclaredConstructor((Class[])null);
		Parse parse  = (Parse)cons.newInstance();
		Method bubbleSort = clazz.getMethod("bubbleSort", int[].class);
		bubbleSort.invoke(parse, a);
	}

}
