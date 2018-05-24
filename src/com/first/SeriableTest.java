/**
 * 
 */
package com.first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



/**
 * @author yuemingdeng
 *
 */
public class SeriableTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student st = new Student("Tom",'M',20,3.6);
		 File file = new File("D:\\Student.txt");
		 file.createNewFile();  
		 
		 //序列化
		 /*FileOutputStream fin = new FileOutputStream(file);
		 ObjectOutputStream oos = new ObjectOutputStream(fin);
		 oos.writeObject(st);
		 oos.flush();
		 oos.close();
		 fin.close();*/
		 
		 //反序列化
		 FileInputStream fin = new FileInputStream(new File("D:\\Student.txt"));
		 ObjectInputStream ois = new ObjectInputStream(fin);
		 Student stu = (Student) ois.readObject();
		 System.out.println(stu.getName());
		 System.out.println(stu.getSex());
		 System.out.println(stu.getYear());
		 System.out.println(stu.getGpa());
	}
	 

}
