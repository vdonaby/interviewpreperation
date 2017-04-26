package com.prep.datastructures;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by z001hk8 on 4/26/17.
 */
public class PermutationTest {

    @Test
    public void checkIfPermutationTest() {
        Permutation permutationTest = new Permutation();
        assertEquals(true, permutationTest.isPermuation("helpme", "mehelp"));
        assertEquals(false, permutationTest.isPermuation("nobody", "noboty"));
    }
}
