package com.test;

class Myfun {
	int height;
	Myfun(){
		System.out.println("没有参数的构造函数");
		height = 4;
	}
	Myfun(int i){
		System.out.println("这里的参数是："+i);
		height = i;
	}
	void info() {
		System.out.println("房子高"+height+"米");
	}
	void info(String s) {
		System.out.println(s+":房子高度为"+height+"米");
	}
}
public class Testfun{
	public static void main(String[] args) {
		//构造函数的重载
		Myfun m = new Myfun(3);
		//方法重载
		m.info();
		m.info("重载方法");
		//重载构造函数
		new Myfun();
	}
}
