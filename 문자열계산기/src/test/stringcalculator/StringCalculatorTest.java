package stringcalculator;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    @Test
    void add() {
        StringCalculator stc = new StringCalculator();
        assertEquals(stc.add(1,2),3);
    }

    @Test
    void subtract() {
        StringCalculator stc = new StringCalculator();
        assertEquals(stc.subtract(4,3),1);
    }

    @Test
    void multiply() {
        StringCalculator stc = new StringCalculator();
        assertEquals(stc.multiply(2,3),6);
    }

    @Test
    void divide() {
        StringCalculator stc = new StringCalculator();
        assertEquals(stc.divide(3,2),1);
    }

    @Test
    void calculator() {
        StringCalculator stc = new StringCalculator();
        assertEquals(stc.calculator(1,'+',4),5);
    }

    @Test
    void calcString() {
        StringCalculator stc = new StringCalculator();
        String str = "1 + 5 * 6 / 6";
        String[] result = stc.splitString(str);
        int totalResult = 6;
        assertEquals(stc.calcString(result),totalResult);
    }

}