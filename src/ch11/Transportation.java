package ch11;

public class Transportation {
    //내가 짠것
    String transformation;
    int price;
    String kind;
    int count;
    public Transportation(){}
    public Transportation(String transformation,String kind, int price){
        this.transformation = transformation;
        this.kind = kind;
        this.price = price;
    }

    public void showTransportInfo(){
        System.out.println(this.transformation+this.price);
    }

    //강의 자료


}
