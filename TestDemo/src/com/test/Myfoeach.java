package com.test;
/**
 * foreach
 * @author Maibenben
 *
 */
public class Myfoeach {
	public static void main(String[] args) {
		int[] intary = {1,23,4,5};
		forDisplay(intary);
		foreachDisplay(intary);
	}
	public static void forDisplay(int[] a) {
		System.out.println("ʹ��for����");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void foreachDisplay(int[] data) {
		System.out.println("ʹ�õ���foreach");
		for (int a : data) {
			System.out.print(a+" ");
		}
	}
}
