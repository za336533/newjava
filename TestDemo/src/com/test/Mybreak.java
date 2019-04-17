package com.test;

public class Mybreak {
	public static void main(String[] args) {
		int[] intary = {1,2,99,88,64,103,115,998,7777};
		int no = 7777;
		int i = 0;
		boolean found = false;
		for(;i<intary.length;i++) {
			if(intary[i] == no) {
				found = true;//这里作为一个标记，进行输出结果
				break;
			}
		}
		if(found) {
			System.out.println(no+" 元素的索引位置在："+i);
		}else {
			System.out.println(no+" 不在数组中");
		}
	}
}
