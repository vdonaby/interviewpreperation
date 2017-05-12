package com.prep.randomProblems;

import org.junit.Test;

/**
 * Created by vdona on 5/11/2017.
 */
public class LeftArrayRotation {

    @Test
    public void testArrayRotation() {

        int array[] = new int[5];
        array[0] = 3;
        array[1] = 6;
        array[2] = 20;
        array[3] = 2;
        array[4] = 60;

        int expectedArray[] = new int[5];
        expectedArray[0] = 2;
        expectedArray[1] = 60;
        expectedArray[2] = 3;
        expectedArray[3] = 6;
        expectedArray[4] = 20;
    }
}
