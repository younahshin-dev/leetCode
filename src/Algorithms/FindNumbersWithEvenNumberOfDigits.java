package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * 1295. Find Numbers with Even Number of Digits
 * 
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */

public class FindNumbersWithEvenNumberOfDigits {
	public int findNumbers(int[] nums) {
		
		int last = 0;
		boolean even = true;
		int cnt = 0;
		for (int num : nums) {
			
			while (num > 0) {
				last = num%10;
				
				if (last%2 != 0) {
					even = false;
					break;
				}
				
				num = num/10;
				
			}
			
			if (even) cnt++;
			even = true;
		}
		
		return cnt;  
    }
	
	@Test
    public void test_FindNumbers() {
		
		int[] nums = {12,345,2,6,7896};

		int result = findNumbers(nums); 
		
        assertEquals(2, result); 
    }
}
