package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

/*
 * 1399. Count Largest Group
 * 
 * Given an integer n. Each number from 1 to n is grouped according to the sum of its digits. 
 * Return how many groups have the largest size.
 * */

public class CountLargestGroup {
	public int countLargestGroup(int n) {
		int[] group = new int[37];
		int temp = 0;
		for (int i = 1; i<= n; i++) {
			if(i<10) {
				group[i] = 1;
			}else {
				temp = sumDigit(i);
				group[temp] = group[temp]+1;
			}
		}
		
		int max = 0;
		int cnt = 0;
		for(int i = 0; i < group.length; i++) {
			if (max < group[i]) {
				max = group[i];
			}
		}
		
		for(int i = 0; i < group.length; i++) {
			if (max == group[i]) {
				cnt++;
			}
		}
        return cnt;
    }
	
	public int sumDigit(int n) {
		int sum = 0; 
		while(n>0) {
			sum += n%10;
			n = n/10;
		}
		return sum;
	}
	@Test
	public void test_countLargestGroup() {
		int param = 13;
		int result = countLargestGroup(param); 
        assertEquals(4, result); 
	}
}
