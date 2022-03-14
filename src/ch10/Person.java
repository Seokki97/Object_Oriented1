package ch10;

public class Person {
    String name;
    int age;

    public Person(){
        //this.name = "김준석"; 이렇게 해도되고
        //this.age = 1;
        this("김준석", 1); //이렇게 호출도 가능하다! 이게 포인트 생성자 안에서 또다른 생성자를 호출
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void showPerson(){
        System.out.println(name + age);
    }
}
