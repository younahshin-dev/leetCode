package Algorithms.FIRST_SEP_20;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * 1051. Height Checker
 * Students are asked to stand in non-decreasing order of heights for an annual photo.
 * Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.
 * Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.
 * */

public class HeightChecker {
	public int heightChecker(int[] heights) {
		int cnt = 0; 
		int[] sorted = new int[heights.length];
		int temp = 0;
		for(int i = 0; i < heights.length; i++) {
			sorted[i] = heights[i];
			for(int j = 0; j < i; j++) {
				if (sorted[j] > sorted[i]) {
					temp = sorted[j];
					sorted[j] = sorted[i];
					sorted[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < heights.length; i++) {
			if (heights[i] != sorted[i]) {
				cnt++;
			}
		}
        return cnt;
    }
	
	@Test
	public void test_HeightChecker() {
		int[] paramHeights = {1,1,4,2,1,3};
		int result = heightChecker(paramHeights); 
		
        assertEquals(3, result); 
	}
}
