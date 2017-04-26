package com.prep.datastructures;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by z001hk8 on 4/26/17.
 */
public class ReverseArrayInPlaceTest {

    @Test
    public void reverseTest() {

        Integer[] array = new Integer[4];
        array[0] = 1;
        array[1] = 5;
        array[2] = 10;
        array[3] = 15;

        Integer[] reversedArray = new Integer[4];
        reversedArray[0] = 15;
        reversedArray[1] = 10;
        reversedArray[2] = 5;
        reversedArray[3] = 1;

        ReverseArrayInPlace reverseTest = new ReverseArrayInPlace();

        assertEquals(reversedArray, reverseTest.reverseArray(array));
    }

    @Test
    public void reverseTestAgain() {

        Integer[] array = new Integer[7];
        array[0] = 1;
        array[1] = 5;
        array[2] = 10;
        array[3] = 15;
        array[4] = 3;
        array[5] = 7;
        array[6] = 9;

        Integer[] reversedArray = new Integer[7];
        reversedArray[0] = 9;
        reversedArray[1] = 7;
        reversedArray[2] = 3;
        reversedArray[3] = 15;
        reversedArray[4] = 10;
        reversedArray[5] = 5;
        reversedArray[6] = 1;

        ReverseArrayInPlace reverseTest = new ReverseArrayInPlace();

        assertEquals(reversedArray, reverseTest.reverseArray(array));
    }
}
