package com.prep.randomProblems;

/**
 * Created by z001hk8 on 4/25/17.
 */
public class NthFib {

    public int findNth(int value) {

        int firstNumber = 0;
        int secondNumber = 1;
        int nthValue = 0;

        for(int i = 1; i < value-1; i++) {
            nthValue = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nthValue;
        }
        return nthValue;
    }
}
