package ch28;

public interface Sell {

    void sell();

    default void order(){
        System.out.println("물건을 팔았ㅅ브니다");
    }
}
