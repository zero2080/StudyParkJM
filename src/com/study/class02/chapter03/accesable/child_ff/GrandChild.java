package com.study.class02.chapter03.accesable.child_ff;

public class GrandChild extends FourthChild{
    public static void main(String[] args) {
        /*
        * 부모클래스의 role변수는 protected접근제어자를 사용하므로 
        * 같은 패키지에 있는 현재클래스가 접근가능하다.
        */
        System.out.println(role);
    }
}
