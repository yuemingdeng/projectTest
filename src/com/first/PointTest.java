/**
 * 
 */
package com.first;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Comparator;
import java.util.ArrayList;

 
//student类，并实现Comparable接口
class Point {
	public Object x;
	public Object y;
	
	public Point () {}
	
	public Point (Object x, Object y) {
		this.x = x;
		this.y = y;
	}
}

public class PointTest {
	public static void main(String[] args) {
		Point p = new Point(1,2.0);
		int x = (Integer)p.x;
		Double y = (Double)p.y;
		
		System.out.println(x + "----" + y);
	}
}