package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.Test;

/*
 * 922. Sort Array By Parity II
 * 
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

 * You may return any answer array that satisfies this condition.
 * */

public class SortArrayByParityII {
	public int[] sortArrayByParityII(int[] A) {
		int[] result = new int[A.length];
		Queue<Integer> param = new ArrayDeque<Integer>();
		for(int i = 0; i < A.length; i++) {
			param.add(A[i]);
		}
		
		int temp = 0; 
		for(int i = 0; i < A.length; i++) {
			for (int j = 0; j < param.size(); j++) {
				temp = param.poll();
				if (i%2 == temp%2 ) {
					result[i] = temp;
					break;
				} else {
					param.add(temp);
				}
			}
		}
		
		return result;
    }

	@Test
	public void test_countLargestGroup() {
		int[] param = {4,2,5,7};
		int[] success = {4,5,2,7};
		
		int[] result = sortArrayByParityII(param); 
        assertEquals(success, result); 
	}
}
