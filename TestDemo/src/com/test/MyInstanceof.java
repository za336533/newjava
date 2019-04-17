package com.test;

import java.util.ArrayList;
import java.util.Vector;

/**
 * ����instanceof�ؼ��ֵ�ʹ��
 * @author Maibenben
 *
 */

public class MyInstanceof {
	public static void main(String[] args) {
		Object testObject = new ArrayList();
		testObject = new Vector();
		displayObjectClass(testObject);
	}
	
	public static void displayObjectClass(Object o) {
		/* instanceof �� Java �ı����ؼ��֡�
		 * ���������ǲ�������ߵĶ����Ƿ������ұߵ����ʵ�������� boolean ���������͡�
		 */
		if(o instanceof Vector) {
			System.out.println("������Java.util.Vector���ʵ��");
		}else if (o instanceof ArrayList) {
			System.out.println("������Java.util.ArrayList���ʵ��");
		}else {
			System.out.println("������ "+o.getClass()+" ���ʵ��");
		}
	}
}
