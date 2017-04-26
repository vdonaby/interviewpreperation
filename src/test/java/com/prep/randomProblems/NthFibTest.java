package com.prep.randomProblems;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by z001hk8 on 4/25/17.
 */
public class NthFibTest {

    @Test
    public void findNthFib() {
        NthFib nthFibTest = new NthFib();
        assertEquals(0, nthFibTest.findNth(1));
        assertEquals(21, nthFibTest.findNth(9));
    }
}
