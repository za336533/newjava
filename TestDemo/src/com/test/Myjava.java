package com.test;

public class Myjava {

	public static void main(String[] args) {
		// 比较字符串大小
		String str = "ni";
		String antstr = "NiHao";
		Object obj = str;
		System.out.println(str.compareTo(antstr));
		System.out.println(str.compareToIgnoreCase(antstr));//不区分大小写
		System.out.println(str.compareTo(obj.toString()));//将object转换会字符
		
		//查找字符出现的位置
		String str1 ="明天有人要过生日了";
		int lastIndex = str1.indexOf("生日");//获取`生日`的下标
		if(lastIndex == -1) {
			System.out.println("没有找到");
		}else {
			System.out.println("最后出现的位置是"+lastIndex);
		}
		
		
		//删除字符
		String str2 = "this is a java ";
		System.out.println(str2.substring(0,3)+str2.substring(4));
		/*
		 * subString是截取的方法，从第一个参数开始到结束参数，但不包括，是将这个字符串返回
		 */
		
		//字符串替换
		String str3 = "nihao zheshi day";
//		System.out.println(str3.replace(',','.'));
		System.out.println(str3.replace('i','y'));//把所有的‘i’换成‘y’
		System.out.println(str3.replaceFirst("h", "b"));//只替换第一次遇到的字符
		System.out.println(str3.replaceAll("shi","zhi"));//返回匹配正则表达式的值
		//字符串反转
		String str4 = "google";
		System.out.println(new StringBuffer(str4).reverse().toString());
		/*
		 * 这里需要通过Stringbuffer将字符串转换成可操作对象。
		 */
		//字符串查找
		String str5 = "google is not found";
		int intIndex = str5.indexOf("not");
		if(intIndex == -1) {
			System.out.println("没有找到");
		}else {
			System.out.println("位置是："+intIndex);
		}
	}

}
