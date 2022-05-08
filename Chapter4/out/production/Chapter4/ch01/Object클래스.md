Object 클래스 - 모든 클래스의 최상위 클래스
===========================
java.lang 패키지
----------
1. 프로그래밍시 import 하지 않아도 자동으로 import 됨
2. import.java.lang.*;
3. 많이 사용하는 기본 클래스들이 속한 패키지
4. String , Integer, System...등

모든 클래스는 Object 클래스를 상속 받는다
------------------------
1. java.lang.Object 클래스
2. 모든 클래스의 최상위 클래스는
3. 모든 클래스는 Object에서 상속받고 Object 클래스의 메서드 중 일부는 재정의 가능
4. 컴파일러가 extends Object를 추가함

toString() 메서드
----------------------
1. 객체의 정보를 String으로 바꾸어서 사용할 때 쓰임
2. String이나 integer클래스는 이미 재정의 도이어있음.