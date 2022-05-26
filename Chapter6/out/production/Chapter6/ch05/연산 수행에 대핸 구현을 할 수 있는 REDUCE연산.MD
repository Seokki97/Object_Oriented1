reduce() 연산
---------------
1. 정의된 연산이 아닌 프로그래머가 직접 구현한 연산을 적용
````
T reduce(T identify(기본값), BinaryOperator<T>(인터페이스or람다식) accumulator)
````
2. 최종 연산으로 스트림의 요소를 소모하며 연산을 수행
3. 배열의 모든 요소의 합을 구하는 reduce연상 구현 예
````
Arrays.stream(arr).reduce(0,(a,b)->a+b)); //sum기본값0  , a,b라는 매개변수를 전달해서 a+b를 합해라(자료를 다 소모할떄까지)
````
4. reduce메서드의 두번쨰 요소로 전달되는 람다식에 따라 다양한 기능을 수행할 수 있음
5. 람다식을 직접 구현하거나 람다식이 긴 경우 binaryOperator를 구현한 클래스로 사용함