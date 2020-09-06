package Algorithms.FIRST_SEP_20;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * 1528. Shuffle String
 * 
 * Given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 * 
 * Return the shuffled string
 * */

public class ShuffleString {
	public String restoreString(String s, int[] indices) {
		char[] index = new char[s.length()];
		
		for (int i = 0; i  < indices.length ; i++) {
			index[indices[i]] = s.charAt(i);
		}
		

		return new String(index);
    }
	
	@Test
	public void test_ShuffleString() {
		int[] param = {4,5,6,7,0,2,1,3};
		String result = restoreString("codeleet", param); 
		
        assertEquals("leetcode", result); 
	}
}
