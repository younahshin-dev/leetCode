package Algorithms;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	1470. Shuffle the Array
 *
 * @desc	
 * 			Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *  		Return the array in the form [x1,y1,x2,y2,...,xn,yn]. * 
 */

public class shuffle {
	
	public int[] shuffle(int[] nums, int n) {
		int temp = 0;
		int[] result = new int[nums.length];
		for(int i = 0; i < nums.length ; i++) {
			//짝수
			if (i < n) {
				result[i*2] = nums[i];
			} else {
				result[i%n+(i-n+1)] = nums[i];	
			}
		}
		
		return result;
        
    }
	

	
	@Test
    public void test_Deck() {
		int[] param = {1,2,3,4,4,3,2,1};
		int[] rightAnswer = {1,4,2,3,3,2,4,1};
		int[] result = shuffle(param, 4); // 함수 실행
		
		assertArrayEquals(rightAnswer, result); // 결과 확인
    }
}
