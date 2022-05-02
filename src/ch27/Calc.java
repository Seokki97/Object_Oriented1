package ch27;

public interface Calc {

    double PI =3.14;
    int ERROR = -999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    //디폴트 예제
    default void description(){
        System.out.println("정수의 사칙연산을 제공합니다");
    } //재정의도 가능하다
//정적메서드 예제
    static int total(int[] arr){
        int total = 0;
        for(int num :arr){
            total += num;
        }
        return total;
    }
    //private메서드 재정의 불가능하다
    private void myMethod(){
        System.out.println("myPrivateMethod");
    }
    //private한 정적 메서드
    private static void myStaticMethod(){
        System.out.println("MystaticMethod");
    }

}
