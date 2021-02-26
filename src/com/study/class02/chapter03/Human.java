package com.study.class02.chapter03;

public class Human{
	{
		//초기화 블록
	}
    static int lag  = 2;
    static int arm  = 2;
    static int hand = 2;
    static int foot = 2;
    static int head = 1;
    static int eye  = 2;
    static int nose = 1;
    static int mouth= 1;
    
    private int knee = 2;
    
    int height;
    int weight=80;
    int sex; //0 : 남 || 1 : 여

    public Human(int height,int weight, int sex){
        this.height=height;
        this.weight=weight;
        this.sex=sex;
    }
    
    public void eat(int cal) {
    	weight+=cal;
    }
    
    public int sum(int x, int y ) {
    	return x+y;
    }
    
}