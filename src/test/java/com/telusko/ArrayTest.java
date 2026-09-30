package com.telusko;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    @Test
    void Test(){
        Array arr = new Array();
//        try{
//            arr.sortArray();
//            System.out.println("Sorting array ");
//            fail();
//        }
//        catch(NullPointerException e){
//            System.out.println("Exception : "+ e);
//        }
//        assertArrayEquals(arr.a, arr.b);
        assertTimeout(Duration.ofMillis(2),()->arr.sortArray(arr.a));
        //assertThrows(NullPointerException.class, ()->arr.sortArray(arr.b));
    }
}
