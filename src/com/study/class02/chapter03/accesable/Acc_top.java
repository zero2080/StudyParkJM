package com.study.class02.chapter03.accesable;

import com.study.class02.chapter03.accesable.child_f.FirstChild;
import com.study.class02.chapter03.accesable.child_ff.FourthChild;

public class Acc_top {
    public static void main(String[] args) {
        /**
         * FirstChild의 role은 public접근제어자 이므로 문제가없다.
         * FourthChild의 role은 protected접근제어자 이므로 
         * FourthChild와는 다른패키지에 존재하는 현재 클래스에서는 
         * 컴파일 에러가 발생한다.
         * 
         * 15번째 줄을 주석처리하면 컴파일에러가 발생하지않고 14번째줄만 정상출력된다.
         */
        System.out.println(FirstChild.role);
//        System.out.println(FourthChild.role);
    }
}
