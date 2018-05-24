/**
 * 
 */
package com.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yuemingdeng
 *
 */
class Student3 implements Comparable<Student3> {
	private int id;
	private String name;
	
	Student3 (){};
	Student3 (int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public void setId(){
		this.id = id;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setName() {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Student3 o) {
		// TODO Auto-generated method stub
		if((this.name).compareTo(o.name) > 0){
			return -1;
			
		}
		return 0;
		
//		return (this.name).compareTo(o.name);
	}

}

public class Student1{
	public static void main(String[] args) {
		List<Student3>list = new ArrayList<>();
		list.add(new Student3(1,"ming"));
		list.add(new Student3(2,"aming"));
		list.add(new Student3(3,"deng"));
		list.add(new Student3(7,"ooa"));
		list.add(new Student3(5,"ply"));
		
		Collections.sort(list);
		for(Student3 ss: list){
			System.out.println(ss.getId() +":" + ss.getName());
		}
	}
}
