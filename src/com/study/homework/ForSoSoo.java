package com.study.homework;

public class ForSoSoo {
	public static void main(String[] args) {
		for(int i =1; i<100; i++) {
			int count = 0;
			for(int j=2; j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(i+ ", ");
			}
		}
	}
}
