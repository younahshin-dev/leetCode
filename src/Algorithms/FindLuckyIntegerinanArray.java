package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

/*
 * 1394. Find Lucky Integer in an Array
 * 
 * Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.
 * Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.
 * */

public class FindLuckyIntegerinanArray {
	
	public int findLucky(int[] arr) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<Integer, Integer> cnt = new HashMap<Integer, Integer>();
		for (int param : arr) {
			if (cnt.containsKey(param)) {
				cnt.put(param, cnt.get(param)+1);
			} else {
				cnt.put(param, 1);
			}
		}
		
		for (int key : cnt.keySet()) {
			if (key == cnt.get(key)) {
				result.add(key);
			}
		}
		
		int maxN = 0;
		if (result.size() > 0) {
			for (int i : result) {
				if (maxN < i) {
					maxN = i;
				}
			}
			return maxN;
		}
		return -1;
    }
	
	@Test
	public void test_findLucky() {
		int[] param = {2,2,3,4};
		int result = findLucky(param); 
        assertEquals(2, result); 
	}
}
