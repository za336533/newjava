package com.test;
/**
 * Java����ö������Ҫʹ��enum�ؼ��������������������Ͷ���java.lang.Enum�������
 * @author Maibenben
 *
 */
public class Myenum {
	public static void main(String[] args) {
		Car c;
		c = Car.audi;
		switch (c) {
		case lamborghini:
			System.out.println("��ѡ����lamborghin");
			break;
		case tata:
			System.out.println("��ѡ����tata");
			break;
		case audi:
			System.out.println("��ѡ����audi");
			break;
		case fiat:
			System.out.println("��ѡ����fiat");
			break;
		case honda:
			System.out.println("��ѡ����honda");
			break;
		default:
			System.out.println("���ҾͲ�֪����");
			break;
		}
	}
}
enum Car{
	lamborghini,tata,audi,fiat,honda
}

