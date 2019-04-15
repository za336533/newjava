package com.test;

import java.util.ArrayList;

public class Myarray {
	public static void main(String[] args) {
		//查找数组中指定元素
		ArrayList<String> objArray = new ArrayList<String>();
		ArrayList<String> objArray1 = new ArrayList<String>();
		objArray.add(0,"t");
		objArray.add(1,"e");
		objArray.add(2,"s");
		objArray.add(3,"t");
		objArray1.add(0,"t");
		objArray1.add(1,"e");
		System.out.println("objArray:"+objArray);
		System.out.println(objArray.contains("t"));
		System.out.println(objArray.contains(objArray1));
	}
}
