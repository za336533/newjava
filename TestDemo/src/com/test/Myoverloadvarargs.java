package com.test;
/**
 * 在重载中使用varargs
 * @author Maibenben
 *
 */
public class Myoverloadvarargs {
	static void vaTest(int...no) {
		System.out.println("vaTest(int ...):" +"参数个数" + no.length +" 内容：");
		for(int n: no) {
			System.out.print(n+ " ");
		}
		System.out.println();
	}
	static void vaTest(boolean...bl) {
		System.out.println("vaTest(boolean ...):" +"参数个数" + bl.length +" 内容：");
		for(boolean b : bl) {
			System.out.print(b + " ");
		}
		System.out.println();
	}
	static void vaTest(String msg,int...no) {
		System.out.println("vaTest(String,int ...):" +"参数个数" + no.length +" 内容：");
		for(int n : no) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		vaTest(1,2,3);
		vaTest("测试:",10,20);
		vaTest(true,false,false,true);
	}
}
