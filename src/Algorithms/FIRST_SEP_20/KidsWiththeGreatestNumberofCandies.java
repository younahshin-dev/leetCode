package Algorithms.FIRST_SEP_20;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	1431. Kids With the Greatest Number of Candies
 *
 * @desc	
 * 			Given the array candies and the integer extraCandies, 
 * 			where candies[i] represents the number of candies that the ith kid has.
 *  		For each kid check if there is a way to distribute extraCandies among the kids such 
 *  		that he or she can have the greatest number of candies among them. 
 *  		Notice that multiple kids can have the greatest number of candies.
 * 
 * 
 */

public class KidsWiththeGreatestNumberofCandies {
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> success = new ArrayList<Boolean>();
		int max = 0;
		for (int i : candies) {
			if (max < i) {
				max = i;
			}
		}
		
		for(int i : candies) {
			success.add(i + extraCandies >= max);
		}
		return success;
    }
	
 	@Test
    public void test() {
		int[] param = {2,3,5,1,3};
		List<Boolean> success = new ArrayList<Boolean>();
		success.add(true);
		success.add(true);
		success.add(true);
		success.add(false);
		success.add(true);
		List<Boolean>  result = kidsWithCandies(param, 3); // 함수 실행
		
        assertEquals(success, result); // 결과 확인
    }
}
