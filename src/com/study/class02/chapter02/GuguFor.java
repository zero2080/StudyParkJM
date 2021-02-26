package com.study.class02.chapter02;

public class GuguFor {
	public static void main(String[] args) {
		int a = 2;
		System.out.println("=========== "+a+"단 ==========");
		for(int b = 1;b < 10;b++) {
			System.out.println(a+" X "+b+" = "+ (a*b));
//			System.out.println(a*b);
			if(a==9) {
				if(b==9) {
					break;
				}
			}
			if(b==9) {
				a++;
				b=0;
				System.out.println("=========== "+a+"단 =========");
			}
		}
	}
}
