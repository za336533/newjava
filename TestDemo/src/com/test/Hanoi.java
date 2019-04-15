package com.test;

public class Hanoi {
	public static void HanoiTower(int topN, char from,char inter,char to) {
		if(topN == 1) {
			System.out.println("Disk 1 from "+from+" to "+to);
		}else {
			HanoiTower(topN-1,from,to,inter);
			System.out.println("Disk "+topN+" from "+from+" to "+to);
			HanoiTower(topN - 1,inter,from,to);
		}
	}
	public static void main(String[] args) {
		int nDisks = 3;
		HanoiTower(nDisks,'a','b','c');
	}
}
