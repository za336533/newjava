package com.test;

import java.text.BreakIterator;

/**
 * Java�б�ǩ��Ϊѭ����Ƶģ���Ϊ���ڶ���ѭ���з����ʹ��break��continue
 * 
 * @author Maibenben
 *
 */
public class Mylabel {
	public static void main(String[] args) {
		String strSearch = "This is the string in which you have to seach for a substring";
		String substring = "substring";
		boolean found = false;
		int max = strSearch.length() - substring.length();
		testlbl:
			for(int i = 0; i <= max;i++) {
				int length = substring.length();
				int j = i;
				int k = 0;
				while(length-- != 0) {
					if(strSearch.charAt(j++) != substring.charAt(k++)) {
						continue testlbl;//����ָ����ǩ��.
					}
				}
				found = true;
				break testlbl;//��ֹѭ���ص���ǩ�������ڽ���ѭ��
			}
		if(found) {
			System.out.println("�������ַ���");
		}else {
			System.out.println("�ַ�����û�з������ַ���");
		}
	}
}
