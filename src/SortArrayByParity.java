import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	905. Sort Array By Parity
 *
 * @desc	
 * 			
 * 			Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * 			You may return any answer array that satisfies this condition.
 * 
 */

public class SortArrayByParity {
	
	public int[] sortArrayByParity(int[] A) {
		int[] result = new int[A.length];
		int idx = 0;
		for (int i : A)
			if (i%2 == 0)
				result[idx++] = i;
		

		for (int i : A)
			if (i%2 > 0)
				result[idx++] = i;
		
		return result;
    }
	
 	@Test
    public void test() {
		int[] input = {3,1,2,4};
		int[] right = {2,4,3,1};
		
		int[] result = sortArrayByParity(input); // 함수 실행
		
        assertEquals(right, result); // 결과 확인
    }
}
