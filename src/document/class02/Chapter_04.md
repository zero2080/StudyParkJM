# 배열(Array)
## 배열 선언
```java
int[] numArr_01 = new int[5];  // 5칸짜리 int형 배열생성
int[] numArr_02 = {1,2,3,4,5};  // 5칸짜리 int형 배열생성
int numArr_03[] = new int[]{1,2,3,4,5}; //5칸짜리 int형 배열생성
```
> 배열을 선언할때는 대괄호`[]`를 쓰고 그 자리는 데이터 타입뒤와 변수명 뒤 둘다 가능하다.    

## 배열 사용방법
```java
int num = numArr_01[0]; //numArr_01배열의 0번 인덱스값을 num에 저장
``` 
> 배열은 인덱스를 이용해서 접근 가능하며 인덱스 번호는 **변수명\[인덱스번호\]** 로 접근한다. 
> - 인덱스(index)
> > 인덱스란 0부터 시작하여 순차적으로 증가하며 붙는 페이지 번호와 같은 개념이다.

## 참조 변수
```java
class Coffee{
    String name;
    int price;
    public Coffee(String name, int price){
        this.name   = name;
        this.price  = price;
    }
}

Coffee[] coffees = {new Coffee("아메리카노",4200),
                    new Coffee("카페모카",6000)
                   };

Coffee c2 = coffees[0];

System.out.println(coffees[0].name);    //아메리카노 출력
System.out.println(c2.name);            //아메리카노 출력

/**
 * coffees의 0번 인덱스에 담긴 클래스(offees[0])의 
 * name변수(coffee[0].name) 에 
 * 저장된 데이터를 "카라멜마끼아또"로 변경
 */
coffees[0].name = "카라멜마끼아또";     

System.out.println(coffees[0].name);      //카라멜마끼아또 출력
System.out.println(c2.name);              //카라멜마끼아또 출력

/**
 * c2 클래스변수의 
 * name변수(c2.name) 에 
 * 저장된 데이터를 "자바칩푸라푸치노"로 변경
 */
c2.name="자바칩푸라푸치노";

System.out.println(coffees[0].name);    //자바칩푸라푸치노 출력
System.out.println(c2.name);            //자바칩푸라푸치노 출력

//아래 두줄은 같은 데이터를 출력한다.
System.out.println(coffees[0]);  //JVM에서 사용하는 가상 메모리 주소 출력
System.out.println(c2);          //JVM에서 사용하는 가상 메모리 주소 출력
```
> 자바에서 객체를 생성하면 메모리영역을 차지하며, 변수에 저장하면 그 메모리 주소가 변수에 저장된다. 
> 그리고 객체변수를 다른 객체 변수를 선언하며 대입하게되면 메모리 주소가 복사된다.  
> 이를 메모리를 **참조**한다고하여 **참조변수**라 한다.     
> 그렇다면 객체를 복사하려면 어떻게 해야할까.

## 객체 복시
객체의 복사에는 얕은복사(`Shalldow Copy`)와 깊은복사(`Deep copy`)가 있다.

- `Shalldow Copy`
> 얕은 복사는 기존에 사용하던 객체를 변수만 지정하여 같은 메모리를 참조하는 경우를 말한다.

- `Deep copy`
> 깊은 복사란 복사하려는 대상의 값들을 메모리상에서도 복제하여 저장하는 것이다.

[[예제코드]](../../com/study/class02/chapter04/ex_array.java)