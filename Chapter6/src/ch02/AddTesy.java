package ch02;

public class AddTesy {
    public static void main(String[] args) {
        Add add = (x,y)->{return x+y;}; //람다식

        System.out.println(add.add(2,4));
    }
}
