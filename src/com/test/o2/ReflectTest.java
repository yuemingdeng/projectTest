/**
 * 
 */
package com.test.o2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yuemingdeng
 *
 */
public class ReflectTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> class1;
		class1 = Class.forName("com.test.o2.Student");
//		Student stu1 = (Student) class1.newInstance();
		/*stu1.setAge(27);
		stu1.setName("dengdeng");
		
		System.out.println(stu1);
		
		
		*/
		
		
		
		Student student;
		Constructor<?> []coustructs = class1.getConstructors();
		for(Constructor ss :coustructs){
			System.out.println(ss);
		}
		student = (Student)coustructs[2].newInstance();
		
		student.setAge(27);
		student.setName("ming");
		System.out.println(student);
		
		
	}

}
