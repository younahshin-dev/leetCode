package Algorithms.FIRST_SEP_20;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * 1486. XOR Operation in an Array
 * 
 * Given an integer n and an integer start.
 * Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
 * Return the bitwise XOR of all elements of nums. 
 * */

public class XOROperationinanArray {
	public int xorOperation(int n, int start) {
		
		int result = 0;
		for (int i = 0 ; i < n ; i++) {
			result ^=(start + 2*i);
		}
        return result;	
    }
	
	@Test
	public void test_SPS() {

		int result = xorOperation(5, 0); 
		
        assertEquals(8, result); 
	}
}
