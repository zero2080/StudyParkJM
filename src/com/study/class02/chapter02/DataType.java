package com.study.class02.chapter02;

public class DataType {
	//변수
	public static void main(String[] args) {
		//정수형
		short s = 25;
		byte b = 0;
		int i = 10;
		long l = 0L;
		
		//소수형
		float f = 0.0F;
		double d = 0.0;
		
		
//		System.out.println(i++);
//		System.out.println(++i);
//		
//		i += 1;
//		System.out.println(i);
//		
//		i = i+1;
//		System.out.println(i);
//		i -= 1;
//		System.out.println(i);
//		i = i-1;
//		System.out.println(i);
//		i *= 2;
//		System.out.println(i);
//		i = i*2;
//		System.out.println(i);
//		i /= 2;
//		System.out.println(i);
//		i = i/2;
//		System.out.println(i);
//		i--;
//		System.out.println(i);
//		--i;
//		System.out.println(i);
//		i = i/2;
//		System.out.println(i);
//		i = i%2;
//		System.out.println(i);

		boolean bool = true;
		boolean bool2 = false;
		
		//비교연산자
		//<, >, <=, >=, ==
		if(i==2) {
			System.out.println("진실");
		}else {
			System.out.println("거짓");
		}
		
		//문자형
		char c = 'c';
		String str = "문자";
		String str2 = new String("문자");
		
		if(str.equals("문자")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(str==str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}
}
