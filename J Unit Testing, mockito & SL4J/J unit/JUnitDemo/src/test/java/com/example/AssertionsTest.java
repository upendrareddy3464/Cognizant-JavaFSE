package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertionsTest {

    AssertionDemo demo = new AssertionDemo();

    @Test
    public void testAssertions() {

        assertEquals(10, demo.add(4, 6));

        
        assertNotEquals(15, demo.add(4, 6));
        assertTrue(demo.isEligible(20));
        assertFalse(demo.isEligible(15));
        assertNull(demo.getNullObject());
        assertNotNull(demo.getObject());
        String s1 = "Java";
        String s2 = s1;
        assertSame(s1, s2);
        String s3 = new String("Java");
        String s4 = new String("Java");
        assertNotSame(s3, s4);
    }
}