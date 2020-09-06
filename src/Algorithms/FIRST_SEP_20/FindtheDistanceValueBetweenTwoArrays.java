package Algorithms.FIRST_SEP_20;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.junit.Test;


/**
 * @title	1385. Find the Distance Value Between Two Arrays
 *
 * @desc	
 * Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
 * 
 * The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
 */

public class FindtheDistanceValueBetweenTwoArrays {
	
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		int cnt = 0;
		for (int i : arr1) {
			for(int j = 0; j < arr2.length; j++) {
				if (-d <= i-arr2[j] && i-arr2[j] <= d) {
					cnt++;
				}
			}
		}
		
		return cnt;
    }
	

	
	@Test
    public void test_findTheDistanceValue() {
		int[] param1 = {4,5,8};
		int[] param2 = {10,9,1,8};
		int distance = 2;
		int result = findTheDistanceValue(param1, param2, distance); // 함수 실행
		
        assertEquals(3, result); // 결과 확인
    }
}
