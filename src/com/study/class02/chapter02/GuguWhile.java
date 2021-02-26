package com.study.class02.chapter02;

public class GuguWhile {
	public static void main(String[] args) {
		int i = 1;
		
		System.out.println("while문");
		while(i<10) {
			System.out.println(2*i);
			i++;
		}
		
		System.out.println("do while문");
		i=1;
		do {
			System.out.println(2*i);
			i++;
		}while(i<10);
	}
}
