package Algorithms;

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
		int[] nums = new int[n];
		
		int result = 0;
		for (int i = 0 ; i < n ; i++) {
			nums[i] = start + 2*i;
		}
		
		for (int i = 0 ; i < n ; i++) {
			if (i == 0) {
				result = nums[0];	
			} else {
				result  = result^nums[i];
			}
		}
		
		return result;	
    }
	
	@Test
	public void test_SPS() {

		int result = xorOperation(5, 0); 
		
        assertEquals(8, result); 
	}
}
