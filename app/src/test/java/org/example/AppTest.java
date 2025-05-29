package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testSum() {
        App classUnderTest = new App();
        int result = classUnderTest.sum(3, 4);
        assertEquals(7, result);
    }
}
