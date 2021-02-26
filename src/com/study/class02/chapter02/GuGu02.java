package com.study.class02.chapter02;

public class GuGu02 {
	public static void main(String[] args) {
		for(int star = 1; star<10; star++) {
			System.out.println(2 * star);
		}
		
		int i = 0;
		while(true) {
			if(i==100) {
				break;
			}else{
				System.out.println(i);
				i++;
			}
		}
		
		i = 0;
		
//		while(i<100) {
//			System.out.println(i);
//			i++;
//		}
		
		System.out.println("i = "+i);
		
		do {
			System.out.println(i);
			i++;
		}while(i<100);
	}
}
