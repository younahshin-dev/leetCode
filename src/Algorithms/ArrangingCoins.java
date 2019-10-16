package Algorithms;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	441. Arranging Coins
 *
 * @desc	
 * 			You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
 * 			Given n, find the total number of full staircase rows that can be formed.
 * 			n is a non-negative integer and fits within the range of a 32-bit signed integer.
 * 
 */

public class ArrangingCoins {
	
	public int arrangeCoins(int n) {
        int cnt = 0; 
		for (int i = 1; n > 0; i++) {
			n -=i;
			
			if (n >= 0 )
				cnt++;
			else
				return cnt;
		}
        
        return cnt;
    }
	

	
	@Test
    public void test_Deck() {
		int param = 8;

		int result = arrangeCoins(param); // 함수 실행
		
        assertEquals(3, result); // 결과 확인
    }
}
