package Algorithms;
import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


/**
 * @title	1207. Unique Number of Occurrences
 *
 * @desc	
 * 			
 * 			Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
 * 
 */

public class UniqueNumberOfOccurrences {
	
	public boolean uniqueOccurrences(int[] arr) {
        
		Map<Object, Integer> cntMap = new HashMap<Object, Integer>();
		for (int c : arr) {
			cntMap.put(c, cntMap.getOrDefault(c, 0)+1);
		}
		
		Collection<Integer> col = cntMap.values();
		Object[] intcol = col.toArray();
		for (int i = 0; i < intcol.length; i++) {
			for (int j = i+1; j < intcol.length; j++) {
				if (intcol[i] == intcol[j]) {
					return false;
				}
			}
		}
		
		return true;
    }
	
 	@Test
    public void test() {
		int[] input = {0,0,-2,-1,4,8,-3,9,6};
		boolean result = uniqueOccurrences(input); // 함수 실행
		
        assertEquals(false, result); // 결과 확인
    }
}
