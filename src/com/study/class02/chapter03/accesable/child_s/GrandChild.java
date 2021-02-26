package com.study.class02.chapter03.accesable.child_s;

public class GrandChild extends SecondChild {
    public static void main(String[] args) {
        //오류!! default 접근제어자는 자식클래스에서 접근 불가
        System.out.println(role);
    }
}
