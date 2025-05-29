package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(App.isPalindrome("madam"));
        assertFalse(App.isPalindrome("hello"));
    }
}
