package com.telusko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitTest {
    @Test
    void test(){
       Reverse rev = new Reverse();
       assertEquals("avaJ", rev.rev("Java"));
       assertEquals("Chaya", rev.rev("ayahC"));

    }

    @Test
    void Test_multipleWord(){
        Reverse r = new Reverse();
        assertEquals("dooG avaJ",r.rev("Java Good"));
    }
}
