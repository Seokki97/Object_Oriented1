package ch11;

public class Student {
    String name;
    int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }
    public void takeBus(Bus bus){
        int price = 1000;
        bus.takeBus(1000);
        money -= price;


    }

    public void takeSubway(Subway subway){
        int price =1200;
        subway.takeSubway(1200);
        money -= price;

    }

    public void showInfo(){
    System.out.println(this.name+"학생의 남은 돈은" + money + "입니다");
    }
}
