import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	136. Single Number
 *
 * @desc	
 * 			Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * 			Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

public class SingleNumber {
	
	public int singleNumber(int[] nums) {
		
		int result = 0;
	        
        for (int c : nums) {
          result = c^result;
        }
        
        //같은 값을 xor 연산하면 결국 0이 나오고 0에 xor 연산한결과는 자기 자신
        return result;
		
    }
	

	
	@Test
    public void test_Deck() {
		int[] deck = {4,1,2,1,2};

		int result = singleNumber(deck); // 함수 실행
		
        assertEquals(1, result); // 결과 확인
    }
}
