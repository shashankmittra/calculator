package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, Main.squareRoot(4), 0.001);
        assertEquals(3.0, Main.squareRoot(9), 0.001);
        assertEquals(4.0, Main.squareRoot(16), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, Main.factorial(0));
        assertEquals(1, Main.factorial(1));
        assertEquals(120, Main.factorial(5));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(0.0, Main.naturalLogarithm(1), 0.001);
        assertEquals(1.609, Main.naturalLogarithm(5), 0.001);
        assertEquals(2.303, Main.naturalLogarithm(10), 0.001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Main.power(2, 3), 0.001);
        assertEquals(25.0, Main.power(5, 2), 0.001);
        assertEquals(1.0, Main.power(10, 0), 0.001);
    }
}
