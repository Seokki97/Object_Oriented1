String 클래스
---------------------
1. String 선언하기
String str1 = new String("abc"); -->힙 메모리에 생성  
String str2 = "abc";
2. 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constance pool)에 있는 주소를 참조하는 두가지 방법임
3. 힙 메모리는 생성될 때마다 다른 주소값을 가지지만, 상수풀의 문자열은 모두 같은 주소값을 가짐
4. 한번 생성된 String은 불변
5. String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됨(메모리 낭비가 발생할 수도)
ex)
````
String java = new String("java");
String java = new String("android");
java = java.concat(android);
````
--> 연결되지않고 새로운 문자열로 탄생 -->이러면 메모리 가비지가 생김  
그래서!!

StringBuilder, StringBuffer 활용해라
---------------------------
1. 내부적으로 가변적인 char[]를 멤버변수로 가짐
2. 문자열을 여러번 연결하거나 변경할 때 사용하면 유용함
3. 새로운 인스턴스를 생성하지 않고 char[]를 변경함
4. StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화를 보장
5. 단인 쓰레드 프로그램에서는 StringBuilder 사용을 권장
6. toString()메서드로 String 반환
7. 결국 메모리 주소는 똑같다.! 이전 concat과 다름

Text block 사용하기
----------------
1. 문자열을 """ """ 사이에 이어서 민들 수 있음.
2. hrml, json 문자열을 만드는데 유용하게 사용할 수 있음.