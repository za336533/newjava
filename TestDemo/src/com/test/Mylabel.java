package com.test;

import java.text.BreakIterator;

/**
 * Java中标签是为循环设计的，是为了在多重循环中方便的使用break和continue
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
						continue testlbl;//跳到指定标签处.
					}
				}
				found = true;
				break testlbl;//终止循环回到标签处并不在进入循环
			}
		if(found) {
			System.out.println("发现子字符穿");
		}else {
			System.out.println("字符串中没有发线子字符串");
		}
	}
}
