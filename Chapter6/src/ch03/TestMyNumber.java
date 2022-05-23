package ch03;

public class TestMyNumber {
    public static void main(String[] args) {

        MyNumber mynum = (num1, num2) -> (num1 >= num2) ? num1:num2; //:는 else역할
        System.out.println(mynum.getMax(10,20));
    }
}
