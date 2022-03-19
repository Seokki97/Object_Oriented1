package ch11;

public class Person {
    int money;

    String personName;

    Transportation TP = new Transportation();

    public Person(){}

    public Person(String personName, int money){
        this.personName = personName;
        this.money = money;
        }



    public void showPersonInfo(){
    System.out.println(this.personName+this.money);
    }
}
