package ch7891011review;

public class Person {
    int haveMoney;
    String name;

    public Person(int haveMoney, String name){
        this.haveMoney = haveMoney;
        this.name = name;
    }

    public void takeTaxi(Taxi taxi){
        taxi.takeTaxi(10000);
        haveMoney -= taxi.price;
    }

    public void showPersonInfo(){
        System.out.println(this.name+"의 남은 돈은" + haveMoney+"입니다.");
    }
}
