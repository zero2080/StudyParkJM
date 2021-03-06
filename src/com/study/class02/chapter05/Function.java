package com.study.class02.chapter05;

public class Function {
	public static void main(String[] args) {

	}

	static void gugu(int i){
		for(int j =1; j<10;j++){
			System.out.println(i*j);
		}
	}
}

class Method{

	public int sum(int ... i){//같은 데이터타입의 갯수를 원하는만큼 받을수 있다.
		int result = 0;
		for(int j : i){
			result += j;
			// result = result + j;
		}
		return result;
	}

	public int sub(int i , int j ){
		return i-j;
	}

	public void print(String word){
		System.out.println(word);
	}

	
}

