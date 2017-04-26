package com.prep.datastructures;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by z001hk8 on 4/26/17.
 */
public class IsPalindromeTest {

    @Test
    public void isPalindromeTest() {
        IsPalindrome isPalindromeTest = new IsPalindrome();
        assertEquals(true, isPalindromeTest.isPalindrome("Anna"));
        assertEquals(false, isPalindromeTest.isPalindrome("nobody"));
    }
}
