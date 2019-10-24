package Algorithms;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	202. Happy Number
 *
 * @desc	
 * 			
 * 			Write an algorithm to determine if a number is "happy".
 * 			A happy number is a number defined by the following process: Starting with any positive integer, 
 * 			replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay),
 * 			 or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 */

public class HappyNumber {
	
	public boolean isHappy(int n) {
		
		boolean result = false;
		
		while (n > 1) {
			n = checkHappy(n);
		}
		
		if (n == 1)
			result = true;
		
		return result;
    }
	
	public int checkHappy(int n) {
		
		int temp = 0;
		String strN = String.valueOf(n);
		String idx = "";
		
		for (int i = 0; i < strN.length(); i++) {
			idx = Character.toString(strN.charAt(i));
			temp += Integer.parseInt(idx)*Integer.parseInt(idx);
		}
		
		return temp;
	}
	
 	@Test
    public void test() {
		int input = 2;
		
		boolean result = isHappy(input); 
		
        assertEquals(true, result); 
    }
}
