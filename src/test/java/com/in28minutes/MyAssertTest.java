package com.in28minutes;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS", "AZure", "DevOps");
    
    @Test
    void test(){
        boolean test = todos.contains("AWS");
        boolean test2 = todos.contains("AWS2");
        // assertEquals(true, test);
        assertTrue(test);
        assertFalse(test2);
        assertArrayEquals(new int[] {1,2}, new int[] {1,2});
    }
}
