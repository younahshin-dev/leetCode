package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

/*
 * 169. Majority Element
 * 
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * */

public class MajorityElement {
	public int majorityElement(int[] nums) {
		
		HashMap num = new HashMap();

		for (int i = 0; i < nums.length; i++) {
			String key = String.valueOf(nums[i]);
			if (!num.containsKey(key)) {
				num.put(key, 1);
			} else {
				num.put(key, Integer.parseInt(String.valueOf(num.get(key)))+1);
			}
		}
		
		
		for(int i : nums) {
			if (Integer.parseInt(String.valueOf(num.get(String.valueOf(i)))) > nums.length/2) {
				return i;
			}
		}
		
		return 0;
    }
	 
	@Test
	public void test_BuildanArrayWithStackOperations() {
		int[] target = {3,2,3};
		int result = majorityElement(target); 
        assertEquals(3, result); 
	}
}
