package com.study.class02.chapter03.accesable.child_t;

public class GrandChild extends ThirdChild{
    public static void main(String[] args) {
        //오류!! private 접근제어자는 자식클래스에서 접근 불가
        System.out.println(role);   
    }
}
