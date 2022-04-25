package ch24;

public class AICar extends Car{ //추상메서드를 오버라이드하지않으면 오류 발생
//Class car must be declared abstract method 라 뜸
    @Override
  public void drive(){
        System.out.println("자율 주행을 합니다");
        System.out.println("자동차가 스스로 달립니다");
    }

    @Override
    public void stop(){
        System.out.println("자율 주행을 멈춥니다");

    }

    @Override
    public void wiper(){
            System.out.println("와이퍼를 작동합니다.");
    }
}
