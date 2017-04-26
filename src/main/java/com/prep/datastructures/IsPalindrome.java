package com.prep.datastructures;

/**
 * Created by z001hk8 on 4/26/17.
 */
public class IsPalindrome {

    public Boolean isPalindrome(String value1) {

        int stringLength1 = 0;
        int stringLength2 = value1.length() - 1;

        value1 = value1.toLowerCase();

        for(int i = 1; i<=value1.length(); i++) {
            if(value1.charAt(stringLength1) != value1.charAt(stringLength2)) {
                return false;
            } else {
                stringLength1++;
                stringLength2--;
            }
        }
        return true;
    }
}
