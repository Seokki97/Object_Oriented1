StringBuffer
--------------
StringBuffer은 문자열을 추가하거나 변경할 때 주로 사용하는 자료형임  

사용되는 메소드는
1. append
2. insert
3. substring

append
--------------
StringBuffer sb = new StringBuffer();  
sb.append("하이");  
sb.append(" ");  
sb.append("객체지향!");  
String result = sb.toString(); <-- toString()메소드를 이용하여 string 자료형으로 변경한다.
--> 하이 객체지향!  

insert
------------
특정 위치에 원하는 문자열을 삽입할 수 있음.  
sb.insert(인덱스, "문자열");

substring
-------------
"hello jump to java"  
--->  
System.out.println(sb.substring(0,4));  
--> Hell  
인덱스 시작부터 끝위치까지 문자를 뽑아낸다.

장점 !
---------------
String 문자열을 += "~" 해서도 결과는 똑같지만  
이는 메모리에 큰 공간을 차지해 문제가 비효율적이다. 따라서 StringBuffer을 쓰는 것이다.  