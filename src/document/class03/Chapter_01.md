# Chapter 01.
 ## 1. 파일 시스템 vs 데이터 베이스
    - **파일 시스템** : 별도의 구입 비용 없이 사용가능. 속도가 빠름. 저장과 열기 제공
    - **데이터 베이스** : 데이터의 독립성. 중복의 최소화, 무결성, 공유, 보안관리 제공


 ## 2. 데이터 베이스 개념
    - 데이터란 현실세계에서 관찰이나 측정을 통해 수집된 사실(fact)이나 값(value)
    - 정보란 데이터의 유효한 해석이나 데이터 상호간의 관계를 의사결정에 도움이 되도록 가공한 것(이것은 데이터의 부가기치를 높임)
        > Information = Process(Data)
        
    - 데이터베이스란 여러 응용 시스템들이 공유할 수 있도록 통합, 저장된 운영데이터의 저장소. 운영상 필요한 데이터를 중복을 최소화하여 컴퓨터 기억 장치 내에 모아 놓은 데이터 집합.
    - 데이터베이스관리시스템(`DBMS`:**D**ata**b**ase **M**anagement **S**ystem)이란 모든 응용프로그램들이 데이터베이스를 공유할 수 있도록 관리해 주고, 데이터베이스를 유지하기 위한 일련의 소프트웨어시스템.
    - 파일 시스템에서 야기되는 데이터의 **종속성**과 **중복성**의 문제점을 해결하기 위한 방법으로 제안. 하나의 `DBMS`에 여러 종류의 응용 프로그램이 공유, 연동될 수 있다.
    - 데이터베이스에 대한 사용자의 모든 요구를 수행할 수 있는 기능을 갖도록 하는 각 단계별 구조와 이들 사이의 인터페이스 및 데이터베이스 언어로 구성된 소프트웨어
    - 데이터베이스 생성/관리, 데이터로부터 사용자의 질의에 대한 답을 검색하는 프로그램의 집합


 ## 3. 데이터 베이스 관리시스템의 기능
 - 정의 기능 (Definition) 

   - 데이터의 형태, 구조, 데이터베이스의 저장에 관한 내용을 정의하며, 다양한 응용 프로그램과 데이터베이스가 서로 인터페이스 할 수 있는 방법 제공

   - 특징

     - 모든 응용 프로그램이 요구하는 데이터 구조를 지원할 수 있게끔 데이터베이스의 논리적 구조와 그 특성을 목표 `DBMS`가 지원하는 데이터 모델에 맞게 기술. 

 - 조작기능
­	
   - 사용자의 요구에 따라 검색, 갱신, 삽입, 삭제 등을 지원하는 기능
­	
   - 사용자와 데이터베이스 사이의 인터페이스를 위한 수단 제공.
­	
   - 특징
     
     - 사용하기 쉽고 자연스러워야 한다. 
     - 명확하고 완전해야 한다. 
     - 효율적이어야 한다.


 - 제어 기능 (Control)

    - 데이터베이스의 내용에 대해 정확성과 안전성을 유지하는 기능(무결성 유지, 보안, 복구, 병행 수행 제어)


    - 특징
      - 데이터베이스를 접근하는 갱신, 삽입, 삭제 작업의 정확하게 수행되게 하여 데이터의 무결성이 파괴되지 않도록 제어할 수 있어야 한다. 
      - 정당한 사용자가 허가된 데이터가 접근할 수 있게끔 보안을 유지하고 권한을 검사할 수 있어야 한다. 
      - 여러 사용자가 데이터베이스를 동시에 접근하여 데이터를 처리할 때 데이터베이스와 처리 결과가 항상 정확성을 유지하도록 병행 제어를 할 수 있어야 한다.

## 4.	데이터베이스의 특성(DB를 사용해야 하는 이유)
 - Realtime accessibilities(실시간처리) 생성된 데이터를 즉시 컴퓨터로 보내 처리하는 방식. 질의에 대한 실시간 처리 및 응답. (원할 때마다 쓰고 읽는다)
 - Continuous Evolution(계속 변화) 새로운 데이터의 `insert`, `delete`, `update` 등의 기능이 수시로 이루어진다
 - Concurrent Sharing(공유) 여러 사용자가 자기가 원하는 데이터에 동시에 접근하여 사용가능
 - Content Reference(내용에 의한 참조) 데이터 레코드들의 주소나 위치가 아니라 사용자가 요구하는 내용, 즉 데이터가 가지고 있는 값에 따라 참조된다

## 5. 데이터베이스 관리 시스템의 장점 
 - 데이터 중복의 최소화 
   - 데이터를 통합하여 관리하므로 데이터의 중복 제어 가능
 - 데이터 공유 
   - 데이터의 통합 관리를 위해 데이터를 공통으로 사용할 수 있도록 데이터를 공통의 저장소에 저장하고 이를 이용하여 데이터를 사용하도록 함
 - 데이터의 무결성, 일관성 유지 
   - 데이터가 중복을 제거하고 데이터의 공유함으로써 데이터간의 불일치가 발생하지 않도록 하여 데이터 관리의 일관성 유지.
   - 데이터베이스에 저장된 데이터 값과 실제 값이 일치하도록 함으로써 무결성 유지.
 - 데이터의 보안 보장 
   - 데이터베이스를 중앙집중식으로 관리하기 하기 때문에 데이터베이스의 관리 및 접근을 효율적으로 관리함으로 모든 데이터에 대해 보안 제공. 
 - 데이터 관리 표준화 (업무의 표준화가 가능)
   - 데이터가 의미하는 내용과 표현하는 형태 사이의 불일치를 방지하기 위해 데이터들에 대한 기준을 명확히 하고 동일한 항목들에 대해 같은 기준이 적용될 수 있도록 함. 
 - 데이터 관리의 유연성 
   - 새로운 데이터에 대한 요구에 대해 유연하게 대처할 수 있도록 하는 것을 의미. 
­	모든 데이터를 공유하여 관리함으로써 사용자가 사용하지 않는 데이터들을 공용으로 사용할 수 있도록 함으로써 새로운 데이터 요구에 대하여 유연하게 대응.
 - 자료에 대한 접근성 및 응답성 향상
   - SQL 등을 사용하여 데이터에 접근할 수 있고, 또한 모든 데이터들을 검색할 수 있는 키로 활용하는 등 자료에 대한 접근성이 탁월.


## ETC. DB 종류
   - RDBMS(**R**elation **D**ata **B**ase **M**anagement **S**ystem)
     - 테이블이라 불리는 공간에 정해진 규칙대로 데이터를 저장하고 관리 하는 시스템
     - 테이블간 관계(**Relation**)을 통해 데이터를 관리하는 시스템
     - 테이블간 관계는 주로 `key`로 관계를 형성하며, 관계가 아니더라도 데이터 자체를 관리하는데 쓰이기도 한다.
     - 키(`key`)의 종류
       - `primary key` or `PK` or `기본키`
         - 테이블 내에 중복을 허용하지 않으며 `null`값을 가질수 없다.
       - `unique key` or `UK` or `고유키`
         - 테이블 내에 중복을 허용하지 않는다.
       - `foreigen key` or `FK` or `참조키` or `외래키`
         - 다른 테이블의 값을 참조는 키로서 `null`값을 가질 수 있다.
         - 외부의 다른 키값을 참조하며, 이 기능이 참조무결성을 가질수 있으며 더 신뢰있는 데이터를 가질 수있는 조건을 만든수 있다.
      
   - NoSQL(**N**ot **O**nly **SQL**)
     - NoSQL의 종류
       - MongoDB
       - 
 - MySQL
   - MySQL 설치
   - 계정 생성
   - 권한 설정
 - DB Client
   - Work Banch 설치
   - 접속설정