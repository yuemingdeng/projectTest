package com.test.o2;

import java.io.Serializable;

/**
 * @author yuemingdeng
 *
 */
public class Student implements Comparable<Student>, Serializable {

	private static final long serialVersionUID = 8255722907932776673L;
	private String name;        // 姓名
    private int age;            // 年龄
	private transient String sex;



    
    public Student() {}
    
    public Student(String name) {
    	this.name = name;
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    
    /**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo (o.name); // 比较年龄(年龄的升序)
    }

}
