package Algorithms.FIRST_SEP_20;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * 1295. Find Numbers with Even Number of Digits
 * 
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */

public class FindNumbersWithEvenNumberOfDigits_2 {
	public int findNumbers(int[] nums) {
		
		int cnt = 0, result = 0;
		for (int num : nums) {
			
			while (num > 0) {
				cnt++;
				num = num/10;
			}
			
			if (cnt%2==0) result++;
			cnt = 0;
		}
		
		return result;  
    }
	
	@Test
    public void test_FindNumbers() {
		
		int[] nums = {437,315,322,431,686,264,442};

		int result = findNumbers(nums); 
		
        assertEquals(0, result); 
    }
}
