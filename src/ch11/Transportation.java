package ch11;

public class Transportation {
    String transformation;
    int price;

    public Transportation(){}
    public Transportation(String transformation, int price){
        this.transformation = transformation;
        this.price = price;
    }

    public void showTransportInfo(){
        System.out.println(this.transformation+this.price);
    }
}
