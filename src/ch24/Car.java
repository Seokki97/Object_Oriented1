package ch24;

public abstract class Car {

    public abstract void drive();
    public abstract  void stop();

    public void startCar(){
        System.out.println("차가 시동을 겁니다");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다");
    }

   final public void run(){ //이 시나리오는 바뀌면 안된다. 순서대로 되어야 하니까. 그래서 final로 선언
        startCar();
        drive();
        stop();
        turnOff();
    }
}
