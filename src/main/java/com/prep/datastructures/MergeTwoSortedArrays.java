package com.prep.datastructures;

/**
 * Created by z001hk8 on 4/26/17.
 */
public class MergeTwoSortedArrays {

    public Integer[] merge(Integer[] array1, Integer[] array2) {     

        int position1 = 0;
        int position2 = 0;

        if(array1 == null) {
            return array2;
        }

        if(array2 == null) {
            return array1;
        }
        
        Integer[] mergedArray = new Integer[array1.length + array2.length];

        for(int i=0; i<mergedArray.length; i++) {
            if(position1 < array1.length) {
                if (array1[position1] < array2[position2]) {
                    mergedArray[i] = array1[position1];
                    position1++;
                } else {
                    mergedArray[i] = array2[position2];
                    position2++;
                }
            } else if(position2 < array2.length) {
                mergedArray[i] = array2[position2];
                position2++;
            }
        }
        return mergedArray;
    }
}
