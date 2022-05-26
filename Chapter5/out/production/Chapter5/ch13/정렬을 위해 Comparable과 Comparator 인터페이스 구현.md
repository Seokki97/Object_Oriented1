TreeSet 클래스 활용하기
---------------------
1. 객체의 정렬에 사용하는 클래스
2. Set 인터페이스를 구현하여 중복을 허용하지 않고, 오름차순이나 내림차순으로 객체를 정렬할 수 있음
3. 내부적으로 이진검색트리로 구현됨
4. 이진검색트리에 저장하기 위해 각 객체를 비교해야 함
5. 비교 대상이 되는 객체에 Comparable이나 Comparator 인터페이스를 구현해야 TreeSet에 추가될 수 있음
6. String, Interger등 jdk의 많은 클래스들이 이미 comparable을 구현했음.

그럼 comparator의 활용
-----------
이미 comparable이 구현된 경우 comparator로 비교하는 방식을 다시 구현할 수 있음
예를들어, comparable로 오름차순으로 구현했는데, 내림차순으로도 새로 구현하고 싶을때
````
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) *-1 ;//원래값에 -1을 함으로써 내림차순으로 바꿈
	}
}

public class ComparatorTest {
	
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
				
		System.out.println(set);
	}
}
````