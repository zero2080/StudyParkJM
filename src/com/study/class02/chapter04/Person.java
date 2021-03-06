package com.study.class02.chapter04;

public class Person{
    public String name;
    public int age;
    public int height;
    public int weight;

    public Person(String name, int age, int weight, int height){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
    }

    @Override
    public String toString(){
        return "name="+name+", age="+age+", weight="+weight+", height="+height;
    }
}