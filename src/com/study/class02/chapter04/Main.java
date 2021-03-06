package com.study.class02.chapter04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Person("박종민",22,50,170),
            new Person("박나래",36,63,153),
            new Person("아이유",30,52,162),
            new Person("김병만",45,62,165),
            new Person("김종민",44,70,170)
        };

        Scanner scan = new Scanner(System.in);

        while(true){
        	System.out.print("학생의 이름을 입력하세요.> ");
            String name = scan.nextLine();
            if(name.equals("exit")){
                System.out.println("종료합니다.");
                break;
            }
            for(int i = 0; i<people.length;i++){
                if(people[i].name.equals(name)){
                    System.out.println(people[i].toString());
                }
            }
        }

        scan.close();
    }

}
