package com.test;

public class Mybreak {
	public static void main(String[] args) {
		int[] intary = {1,2,99,88,64,103,115,998,7777};
		int no = 7777;
		int i = 0;
		boolean found = false;
		for(;i<intary.length;i++) {
			if(intary[i] == no) {
				found = true;//������Ϊһ����ǣ�����������
				break;
			}
		}
		if(found) {
			System.out.println(no+" Ԫ�ص�����λ���ڣ�"+i);
		}else {
			System.out.println(no+" ����������");
		}
	}
}
