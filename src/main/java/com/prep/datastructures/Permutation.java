package com.prep.datastructures;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by z001hk8 on 4/25/17.
 */

public class Permutation {

    public Boolean isPermuation(String value1, String value2) {

        HashMap<Character, Integer> value1Letters = new HashMap<>();
        HashMap<Character, Integer> value2Letters = new HashMap<>();

        if(value1.length() != value2.length()) {
            return false;
        } else {
            for(int i=0; i<value1.length(); i++) {
                int currentValueForLetter1 = 0;
                if(value1Letters.get(value1.charAt(i)) != null) {
                    currentValueForLetter1 = value1Letters.get(value1.charAt(i)) + 1;
                }
                value1Letters.put(value1.charAt(i), currentValueForLetter1 + 1);
            }

            for(int i=0; i<value2.length(); i++) {
                int currentValueForLetter2 = 0;
                if(value2Letters.get(value2.charAt(i)) != null) {
                    currentValueForLetter2 = value2Letters.get(value2.charAt(i)) + 1;
                }
                value2Letters.put(value2.charAt(i), currentValueForLetter2 + 1);
            }

            System.out.println("HashMap1: " + value1Letters.toString());
            System.out.println("HashMap2: " + value2Letters.toString());

            if(value1Letters.equals(value2Letters)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
