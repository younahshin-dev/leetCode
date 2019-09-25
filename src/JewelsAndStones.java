import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	771. Jewels and Stones
 *
 * @desc	
 * 			You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
 * 			Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *			The letters in J are guaranteed distinct, and all characters in J and S are letters. 
 *			Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *			
 */

public class JewelsAndStones {
	
	public static int numJewelsInStones(String J, String S) {
		
		int num = 0;
		char[] Jewels = J.toCharArray();
		char[] distinctJewels = new char[50];
		
		for (int i = 0; i < Jewels.length; i++) {
			distinctJewels[i] = Jewels[i];
			for (int j = i+1; j < Jewels.length; j++)  
				if  (Jewels[i] == Jewels[j]) 
					Jewels[j] = '\0';
				
		}
			
		
		for (int i = 0; i < S.length(); i++) 
			for (char c : distinctJewels) 
				if (c == S.charAt(i))
					num++;
					
			
			
		
		
		
		 
		return num;
		
    }
	

	
	@Test
    public void test() {
		String J = "aA", S = "aAAbbbb";
		

		int result = numJewelsInStones(J, S); // 함수 실행
		
        assertEquals(3, result); // 결과 확인
    }
}
