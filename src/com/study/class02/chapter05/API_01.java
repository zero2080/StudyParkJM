package com.study.class02.chapter05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class API_01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getWeekYear());  //지금 해당연도
        System.out.println(Calendar.MONTH+1);   //현재 월 ( 0 ~ 11 로 표기하기때문에 1을 더해줘야함)

        Date date = new Date();

        System.out.println(System.currentTimeMillis());
        System.out.println(date.getTime());

        System.out.println("밀리초 : "+date.getTime()%1000);
        System.out.println("초 : " + date.getTime()/1000%60);
        System.out.println("분 : " + date.getTime()/1000/60%60);
        System.out.println("시 : " + date.getTime()/1000/60/60%24);
        System.out.println("일 : " + date.getTime()/1000/60/60/24%365);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
        
        System.out.println(sdf.format(date));

        int i = 20;

        Integer aa = 100;
        System.out.println(i+aa);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("값 : " + (29843+7));
        System.out.println("값 : " + ("29843"+7));
        System.out.println("값 : " + (Integer.parseInt("29843")+7));
        
        
        Singleton s = Singleton.getInstance();
        s.name="오범수";

        Singleton g = Singleton.getInstance();
        g.name="박종민";

        System.out.println(s.name);
        System.out.println(g.name);
    }
}

class Singleton{
    private static Singleton instance;

    public String name = "";

    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public int add(int i , int j ){
        return i+j;
    }


}