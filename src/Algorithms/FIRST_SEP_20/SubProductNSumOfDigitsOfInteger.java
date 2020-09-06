package Algorithms.FIRST_SEP_20;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * 1281. Subtract the Product and Sum of Digits of an Integer
 * 
 * Given an integer number n, return the difference between 
 * the product of its digits and the sum of its digits.
 */

public class SubProductNSumOfDigitsOfInteger {
	public int subtractProductAndSum(int n) {
		
		int product =1;
		int sum = 0;
		
		while(true) {
			product *= n%10;
			sum += n%10;
			n = n/10;
			if (n == 0)break;
		}
		
		return product - sum;
    }
	
	@Test
	public void test_SPS() {
		int num = 234;

		int result = subtractProductAndSum(num); 
		
        assertEquals(15, result); 
	}
}


