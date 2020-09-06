package Algorithms.FIRST_SEP_20;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	1512. Number of Good Pairs
 *
 * @desc	
 * 			Given an array of integers nums.
 * 			A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 * 			Return the number of good pairs. * 
 */

public class NumberofGoodPairs {
	
	public int numIdenticalPairs(int[] nums) {
        int result = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	for(int j = i+1; j < nums.length; j++) {
        		if (nums[i] == nums[j]) {
        			result++;
        		}
        	}
        }
        
		return result;
    }

	
	@Test
    public void test_Deck() {
		int[] param = {1,2,3,1,1,3};

		int result = numIdenticalPairs(param); // 함수 실행
		
        assertEquals(4, result); // 결과 확인
    }
}
