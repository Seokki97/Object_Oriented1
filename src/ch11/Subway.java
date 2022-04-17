package ch11;

public class Subway {
    int subNum;
    int price;
    int count =0;
    public Subway(int subNum){
        this.subNum = subNum;
    }

    public void takeSubway(int price){
        count++;
    }


    public void showSubwayInfo(){
        System.out.println("열차의 승객은" +count + "명 입니ㄷ");
    }
}
