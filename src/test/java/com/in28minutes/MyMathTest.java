package com.in28minutes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.in28minutes.junit.MyMath;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Test
    void calculateSumWith4Values(){
        assertEquals(10, myMath.calculateSum(new int[] {1,2,3,4}));
    }

    @Test
    void calculateSumWith0Values(){
        assertEquals(0, myMath.calculateSum(new int[] {}));
    }
}
