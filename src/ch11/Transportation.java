package ch11;

public class Transportation {
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
}
