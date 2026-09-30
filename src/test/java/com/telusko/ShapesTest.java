package com.telusko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapesTest {
    Shapes shape = new Shapes();
    @Test
    void testComputeSquareArea(){

        assertEquals(576, shape.computeSquareArea(24),"Area of circle is wrong");
    }
    @Test
    void testComputeCircleTest(){
        assertEquals(78.5, shape.computeCircleArea(5),()-> "Area of circle is wrong");
    }
    @Test
    void testComputeNoSquareArea(){
        assertNotEquals(56, shape.computeSquareArea(24));
    }
    @Test
    void Test(){
        String str = "Junit";

        assertTrue(str.equals("Junit"));

        String s= "String";
        assertFalse(s.length()<5," String length should be atleast 5");
    }
}
