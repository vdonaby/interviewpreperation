package com.prep.algorithms;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumProfitTest {
	
	@Test
	@Ignore
	public void maximumProfitTest() {
		
		MaxProfit maxProfitTest = new MaxProfit();
		
		int[] prices = new int[6];
		prices[0] = 2;
		prices[1] = 15;
		prices[2] = 60;
		prices[3] = 15;
		prices[4] = 90;
		prices[5] = 3;
		
		assertEquals(133, maxProfitTest.maximumProfit(prices));
	}
}
