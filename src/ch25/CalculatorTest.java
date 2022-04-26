package ch25;

public class CalculatorTest {
    public static void main(String[] args) {

        Calc calc = new CompleteCalc();

       System.out.println(calc.add(3,4));
        System.out.println(calc.substract(4,6));
        System.out.println(calc.times(3,4));
        System.out.println(calc.divide(10,2));

        //타입을 Calc로 했기 떄문에 인터페이스에 있는 메서드만 쓸수있음 그래서 showinfo가 안됨
        //calc.showInfo();

        //대신 타입을 다른걸로 하면 가능하다
        CompleteCalc calc2 = new CompleteCalc();
        calc2.showInfo();
    }
}
