package ch25;

public class CalculatorTest {
    public static void main(String[] args) {

        Calc calc = new CompleteCalc();

       System.out.println(calc.add(3,4));
        System.out.println(calc.substract(4,6));
        System.out.println(calc.times(3,4));
        System.out.println(calc.divide(10,2));
        //calc.showInfo();
    }
}
