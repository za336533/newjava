package com.test;
/**
 * Java创建枚举类型要使用enum关键字隐含了所创建的类型都是java.lang.Enum类的子类
 * @author Maibenben
 *
 */
public class Myenum {
	public static void main(String[] args) {
		Car c;
		c = Car.audi;
		switch (c) {
		case lamborghini:
			System.out.println("你选择了lamborghin");
			break;
		case tata:
			System.out.println("你选择了tata");
			break;
		case audi:
			System.out.println("你选择了audi");
			break;
		case fiat:
			System.out.println("你选择了fiat");
			break;
		case honda:
			System.out.println("你选择了honda");
			break;
		default:
			System.out.println("那我就不知道了");
			break;
		}
	}
}
enum Car{
	lamborghini,tata,audi,fiat,honda
}

