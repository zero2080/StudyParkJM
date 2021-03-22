package com.study.class02.chapter03;

public class JavaClass {
    public static void main(String[] args){
        System.out.println(Human.hand);
        //System.out.println(Human.weight);     //오류!! 객체가 생성되지 않으면 인스턴스변수가 초기화 되지 않아서 사용할 수없다.
        
        Human me = new Human(177,88,0);         //Human 객체를 초기화(생성) 한다(파라미터)
//        Human you = new Human(165,55,1);
        //System.out.println(Human.weight);     //오류!! 객체는 생성했지만 weight값을 가져올수 없다. weight는 인스턴수 변수이기때문에 클래스변수명을 통해 가져와야 한다.

        System.out.println(me.weight);          //8번줄에서 생성한 객체의 값을 사용.
        
        int bread = 120;
        
        me.eat(bread);
        
        System.out.println(me.weight);
        
        int result = me.sum(200, 99);
        System.out.println(result);
    }
}
