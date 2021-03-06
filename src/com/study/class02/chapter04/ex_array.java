package com.study.class02.chapter04;

public class ex_array {
    public static void main(String[] args) {
        int[] numArr_01 = new int[5];
        int[] numArr_02 = {1,2,3,4,5};
        int numArr_03[] = new int[]{1,2,3,4,5};
        System.out.println(numArr_03[0]);

        Coffee[] coffees = {
            new Coffee("아메리카노",4200),
            new Coffee("카페모카",6000)
        };

        Coffee c2 = coffees[0];

        System.out.println(coffees[0].name);
        System.out.println(c2.name);
        
        coffees[0].name = "카라멜마끼아또";
        
        System.out.println(coffees[0].name);
        System.out.println(c2.name);
        
        c2.name="자바칩푸라푸치노";
        
        System.out.println(coffees[0].name);
        System.out.println(c2.name);
        
        c2 = coffees[0].clone();
        
        c2.name="핫쪼꼬";
        
        System.out.println(coffees[0].name);
        System.out.println(c2.name);
    }
}

class Coffee{
    String name;
    int price;
    public Coffee(String name, int price){
        this.name=name;
        this.price=price;
    }

    //객체 복사 메서드
    public Coffee clone() {
        return new Coffee(new String(this.name),this.price);
    }
}