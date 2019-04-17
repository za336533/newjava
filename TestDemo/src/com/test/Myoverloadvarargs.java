package com.test;
/**
 * ��������ʹ��varargs
 * @author Maibenben
 *
 */
public class Myoverloadvarargs {
	static void vaTest(int...no) {
		System.out.println("vaTest(int ...):" +"��������" + no.length +" ���ݣ�");
		for(int n: no) {
			System.out.print(n+ " ");
		}
		System.out.println();
	}
	static void vaTest(boolean...bl) {
		System.out.println("vaTest(boolean ...):" +"��������" + bl.length +" ���ݣ�");
		for(boolean b : bl) {
			System.out.print(b + " ");
		}
		System.out.println();
	}
	static void vaTest(String msg,int...no) {
		System.out.println("vaTest(String,int ...):" +"��������" + no.length +" ���ݣ�");
		for(int n : no) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		vaTest(1,2,3);
		vaTest("����:",10,20);
		vaTest(true,false,false,true);
	}
}
