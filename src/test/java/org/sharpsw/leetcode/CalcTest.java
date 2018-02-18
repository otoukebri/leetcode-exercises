package org.sharpsw.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalcTest {
    private Calc calc = new Calc();

    @Test
    public void shouldParseNumbers() {
        assertEquals(3, calc.evaluate("3"), 0);
    }

    @Test
    public void shouldParseFloats() {
        assertEquals(3.5, calc.evaluate("3.5"), 0);
    }

    @Test
    public void shouldSupportAddition() {
        assertEquals(4, calc.evaluate("1 3 +"), 0);
    }

    @Test
    public void shouldSupportMultiplication() {
        assertEquals(3, calc.evaluate("1 3 *"), 0);
    }

    @Test
    public void shouldSupportSubtraction() {
        assertEquals(-2, calc.evaluate("1 3 -"), 0);
    }

    @Test
    public void shouldSupportDivision() {
        assertEquals(2, calc.evaluate("4 2 /"), 0);
    }

    @Test
    public void shouldCalculateOk() {
        assertEquals(6, calc.evaluate("7 4 5 + * 3 - 10 /"), 0);
    }

    @Test
    public void shouldCalculateAnotherExpr() {
        // 3 2 1 - *
        assertEquals(3, calc.evaluate("3 2 1 - *"), 0);
    }

    @Test
    public void shouldSupportEmptyExpr() {
        assertEquals(0, calc.evaluate(""), 0);
    }
}
