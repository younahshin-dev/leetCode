package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * 1342. Number of Steps to Reduce a Number to Zero
 * 
 * Given a non-negative integer num, return the number of steps to reduce it to zero. 
 * If the current number is even, you have to divide it by 2, otherwise, 
 * you have to subtract 1 from it.
 */

public class NumberOfStepsToReduceaNumberToZero {

	public static int numberOfSteps (int num) {
		int step = 0;
		
		while (true) {
			step++;
			
			if (num%2 == 0) {
				num = num/2;
			} else {
				num--;
			}
			
			if (num == 0) break;
		}
		
		return step;
    }

	@Test
    public void test_Deck() {
		
		int num = 8;
		int result = numberOfSteps(num); 
		
        assertEquals(4, result); 
    }
}
