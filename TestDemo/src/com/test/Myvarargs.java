package com.test;

public class Myvarargs {
	static int sumvarargs(int...intArrays) {
		int sum, i;
		sum = 0;
		for ( i = 0; i < intArrays.length; i++) {
			sum += intArrays[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int sum = 0;
		sum = sumvarargs(new int[] {1,2,0,5,5});
		System.out.println(sum);
	}

}
