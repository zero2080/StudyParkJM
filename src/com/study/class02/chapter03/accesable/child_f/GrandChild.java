package com.study.class02.chapter03.accesable.child_f;

public class GrandChild extends FirstChild {
    public static void main(String[] args) {
        //부모클래스의 role변수는 public접근제어자를 사용하므로 정상사용가능
        System.out.println(role);
    }
}