package com.junitbasics;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Absense of failure is success

class MyMathTest {

    //BeforeAll should be static.
    @BeforeAll
    public static void BeforeAll(){
        System.out.println("BeforeAll");
    }

    //BeforeEach shouldn't be static

    @BeforeEach
    public void BeforeEach(){
        System.out.println("BeforeEach");
    }

    @BeforeEach
    public void afterEach(){
        System.out.println("afterEach");
    }

    @Test
    public void sumWith3Numbers(){
        MyMath myMath = new MyMath();
        assertEquals(2, myMath.sum(new int[]{1,-2,3}));
    }

    @Test
    public void sumWith1Numbers(){
        MyMath myMath = new MyMath();
        assertEquals(3, myMath.sum(new int[]{3}));
    }

    @Test
    public void test(){
        boolean condn = true;
        assertEquals(true, condn);
        assertTrue(condn);
//        assertFalse(condn);
//        assertArrayEquals(new int[]{1,2,3}, new int[]{1,4,3});
    }
}