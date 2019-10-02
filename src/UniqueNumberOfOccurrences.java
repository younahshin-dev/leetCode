import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

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
        
		int[] cnt = new int[1000];
        
        for (int i : arr) 
        	cnt[i]++;
        
        for (int i = 0 ; i< cnt.length ; i++) {
        	for (int j = 0  ; j< cnt.length; j++) {
        		if (cnt[i]!=0 && cnt[j]!=0) {
	        		if (i != j && cnt[i] == cnt[j]) {
	        			return false;
	        		}
        		}
        	}
        }
        
		return true;
    }
	
 	@Test
    public void test() {
		int[] input = {-3,0,1,-3,1,1,1,-3,10,0};

		boolean result = uniqueOccurrences(input); // 함수 실행
		
        assertEquals(true, result); // 결과 확인
    }
}
