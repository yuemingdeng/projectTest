package com.test.o2;

/**
 * @author yuemingdeng
 *
 */
public class Student implements Comparable<Student> {
	
	private String name;        // 姓名
    private int age;            // 年龄 
    
    public Student() {}
    
    public Student(String name) {
    	this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

	

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo (o.name); // 比较年龄(年龄的升序)
    }

}
