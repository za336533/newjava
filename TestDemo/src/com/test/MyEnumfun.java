package com.test;


enum Car1 {
	lamborghini(900),tata(2),fiat(15),honda(12);
	private int price;
	Car1(int p){
		price = p;
	}
	int getPrice() {
		return price;
	}
}

public class MyEnumfun {
	public static void main(String[] args) {
		System.out.println("�����ﳵ�۸�");
		for(Car1 c:Car1.values()) {
			System.out.println(c +" ��Ҫ "+c.getPrice()+" ǧ��Ԫ��");
		}
	}
}


