package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

import org.junit.Test;

/*
 * 13. Roman to Integer
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * 
 * Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000
 * */

public class MajorityElement {
	public int romanToInt(String s) {
		HashMap<String, Integer> romanSet = new HashMap<String, Integer>();
		
		romanSet.put("I", 1);
		romanSet.put("V", 5);
		romanSet.put("X", 10);
		romanSet.put("L", 50);
		romanSet.put("C", 100);
		romanSet.put("D", 500);
		romanSet.put("M", 1000);
		int result = 0;
		int pre = 0;
		int cur = 0;
		for (int i = s.length()-1 ; i >= 0 ; i--) {
			cur = romanSet.get(String.valueOf(s.charAt(i)));

			if (cur >= pre) {
				result += cur;
			} else {
				result -=cur;
			}
			pre = cur;
		}
		return result;
    }
	 
	@Test
	public void test_BuildanArrayWithStackOperations() {
		String roman = "XII";
		int result = romanToInt(roman); 
        assertEquals(12, result); 
	}
}
