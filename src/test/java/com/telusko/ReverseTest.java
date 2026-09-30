package com.telusko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {
    @Test
    public void test(){
        Reverse rev = new Reverse();
        assertEquals("avaJ", rev.rev("Java"));
    }
}
