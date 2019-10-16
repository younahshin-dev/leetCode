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
 * @title	961. N-Repeated Element in Size 2N Array
 *
 * @desc	
 * 			
 * 			In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 * 			Return the element repeated N times.
 * 
 */

public class NRepeatedElementInSize2NArray {
	
	public int repeatedNTimes(int[] A) {
		int[] cnt = new int[A.length];
        int result = 0;
		
		for (int i : A) 
			cnt[i]++;
		
		for (int i = 0 ; i < cnt.length; i++)
			if (cnt[i] > 1)
				result = i;
	
		return result;
    }
	
 	@Test
    public void test() {
		int[] input = {1,2,3,3};
		
		int result = repeatedNTimes(input); // 함수 실행
		
        assertEquals(3, result); // 결과 확인
    }
}
