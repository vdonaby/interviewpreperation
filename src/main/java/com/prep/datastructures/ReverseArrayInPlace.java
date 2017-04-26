package com.prep.datastructures;

/**
 * Created by z001hk8 on 4/26/17.
 */
public class ReverseArrayInPlace {

    public Integer[] reverseArray(Integer[] array) {

        int lastElement = array.length - 1;

        for(int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i] = array[lastElement];
            array[lastElement] = temp;
            lastElement--;
        }

        for(int i=0; i<array.length; i++) {
            System.out.println("Array at element " + i + ": " + array[i]);
        }
        return array;
    }
}
