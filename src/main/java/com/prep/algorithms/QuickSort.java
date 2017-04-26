package com.prep.algorithms;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

/**
 * Created by z001hk8 on 4/26/17.
 */
public class QuickSort {

    public int[] quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);

        for(int i=0; i<array.length; i++) {
            System.out.println("Sorted array: " + array[i]);
        }

        return array;
    }

    public static void quickSort(int[] array, int left, int right) {

        if(left >= right) {
            return;
        }

        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quickSort(array, left, index - 1);
        quickSort(array, index, right);

    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while(left<=right) {

            while(array[left] < pivot) {
                left++;
            }

            while(array[right] > pivot) {
                right--;
            }

            if(left<=right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
