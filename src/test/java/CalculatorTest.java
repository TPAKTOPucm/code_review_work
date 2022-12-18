package src.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(5,Calculator.add(2,3));
    }

    @Test
    void dif() {
        assertEquals(6,Calculator.dif(9,3));
    }

    @Test
    void div() {
        assertEquals(5,Calculator.div(15,3));
    }

    @Test
    void times() {
        assertEquals(24,Calculator.times(8,3));

    }

    @Test
    void solver() {
        assertEquals(222435,Calculator.solver());
    }
}