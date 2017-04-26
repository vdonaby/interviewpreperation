package com.prep.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by z001hk8 on 4/26/17.
 */

public class QuickSortTest {

    @Test
    public void quickSortTest() {

        int[] array = new int[4];

        array[0] = 22;
        array[1] = 10;
        array[2] = 66;
        array[3] = 3;

        int[] result = new int[4];

        result[0] = 3;
        result[1] = 10;
        result[2] = 22;
        result[3] = 66;

        QuickSort quickSortTest = new QuickSort();
        assertArrayEquals(result, quickSortTest.quickSort(array));
    }

}
