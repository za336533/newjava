package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mydate {

	public static void main(String[] args) {
		/*
		 * Date date = new Date(); String strDateformate = "YYYY-MM-dd HH:mm:ss";
		 * //使用SimpleDateFormate时间 SimpleDateFormat sdf = new
		 * SimpleDateFormat(strDateformate); //用format()方法输出
		 * System.out.println(sdf.format(date));
		 * 
		 * //获取当前时间 SimpleDateFormat sdf1 = new SimpleDateFormat();//格式化时间
		 * sdf1.applyPattern("yyyy-MM-dd HH:mm:ss a");//a:am/pm标记 Date date1 = new
		 * Date(); System.out.println("现在时间："+sdf1.format(date1));
		 */
		
		//获取年份，月等 Calendar获取单独的部分
		/*
		 * Calendar cal = Calendar.getInstance(); int day = cal.get(Calendar.DATE); int
		 * month = cal.get(Calendar.MONTH); int year = cal.get(Calendar.YEAR); int dow =
		 * cal.get(Calendar.DAY_OF_WEEK); int dom = cal.get(Calendar.DAY_OF_MONTH); int
		 * doy = cal.get(Calendar.DAY_OF_YEAR);
		 * 
		 * System.out.println("现在时间："+cal.getTime()); System.out.println("现在日期："+day);
		 * System.out.println("现在月份："+(month+1));//因为Calendar.MONTH是0-11
		 * System.out.println("现在年份："+year); System.out.println("一周中的第："+dow);
		 * System.out.println("一个月中第："+dom); System.out.println("一年中第："+doy);
		 */
		//将时间戳转换为时间
		Long timeStamp = System.currentTimeMillis();//获取档期那时间戳
		System.out.println(timeStamp);//是获得一个毫秒数
		//创建SimpleDateFormat对象
		SimpleDateFormat sdf2 = new SimpleDateFormat();
		/*	
		 * 创建时间格式
		 * SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 * 将时间戳转换为时间并将其格式化
		 * String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
		 */
		//时间格式
		sdf2.applyPattern("yyyy-MM-dd HH:mm:ss");
		//时间戳转换为时间
		Date sd = new Date(timeStamp);
		System.out.println("现在时间："+sdf2.format(sd));
	}

}
