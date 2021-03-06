package stringcalculator;

public class StringCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {

        return a - b;
    }

    public int multiply(int a, int b) {

        return a * b;
    }

    public int divide(int a, int b) {
        try {
            if (b == 0) {
                return a / b;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return a / b;
    }

    public int calculator(int front, char middle, int back) {
        int result = 0;
        if (middle == '+') return result = add(front, back);

        if (middle == '-') return result = subtract(front, back);

        if (middle == '*') return result = multiply(front, back);

        if (middle == '/') return result = divide(front, back);

        else
            try {
                System.out.println("입력값이 잘못되었습니다");
            } catch (Exception e) {
                System.out.println(e);
            }
        return result;
    }

    public String[] splitString(String str) {
        return str.split(" ");
    }

    public int toInt(String str) {
        return Integer.parseInt(str);
    }

    public int calcString(String[] str) {
        int result = toInt(str[0]);
        //4+6*3+2 -> 10*3+2  6이다. -> 10
        for (int i = 0; i < str.length - 2; i += 2) {
            result = calculator(result, str[i + 1].charAt(0), toInt(str[i + 2]));
        }
        return result;
    }

}
