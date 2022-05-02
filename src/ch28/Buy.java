package ch28;

public interface Buy {

     void buy();


    default void order(){
        System.out.println("제품을 주문했습니다");
    }
}
