package com.example.ameen.testunit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void division_isCorrect() throws Exception {
        MainActivity m = new MainActivity();
        double x = m.division(10.0,2.0);
        assertEquals("is not correct", 5.0, x, 0);
    }
}