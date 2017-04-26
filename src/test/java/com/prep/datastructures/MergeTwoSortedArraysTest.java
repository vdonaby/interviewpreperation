package com.prep.datastructures;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by z001hk8 on 4/26/17.
 */
public class MergeTwoSortedArraysTest {

    @Test
    public void mergeTest() {

        Integer[] array1 = new Integer[3];
        Integer[] array2 = new Integer[5];
        Integer[] array3 = new Integer[8];

        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 5;

        array2[0] = 1;
        array2[1] = 7;
        array2[2] = 10;
        array2[3] = 11;
        array2[4] = 12;

        array3[0] = 1;
        array3[1] = 1;
        array3[2] = 2;
        array3[3] = 5;
        array3[4] = 7;
        array3[5] = 10;
        array3[6] = 11;
        array3[7] = 12;

        MergeTwoSortedArrays mergeTest = new MergeTwoSortedArrays();
        assertEquals(array3, mergeTest.merge(array1, array2));
    }

    @Test
    public void mergeTest2() {

        Integer[] array1 = new Integer[3];
        Integer[] array3 = new Integer[3];

        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 5;

        array3[0] = 1;
        array3[1] = 2;
        array3[2] = 5;


        MergeTwoSortedArrays mergeTest = new MergeTwoSortedArrays();
        assertEquals(array3, mergeTest.merge(array1, null));

    }
}
