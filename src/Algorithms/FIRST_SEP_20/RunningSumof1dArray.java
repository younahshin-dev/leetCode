package Algorithms.FIRST_SEP_20;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 1480. Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 *
 */
public class RunningSumof1dArray {
	 public int[] runningSum(int[] nums) {
		int numStep = 0;
        int[] result = new int[nums.length];
        for(int i = 0; i< nums.length; i++) {
            
        	numStep += nums[i];
            result[i] = numStep;
        }
        
        return result;
    }
	 
	 @Test
	 public void test_1480() {
		 int[] param = {1,1,1,1,1};
		 int[] success = {1,2,3,4,5};

			int[] result = runningSum(param); // 함수 실행
			assertArrayEquals(success, result);
	 }
}
