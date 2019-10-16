package Algorithms;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	383. Ransom Note
 *
 * @desc	
 * 			Given an arbitrary ransom note string and another string containing letters from all the magazines, 
 * 			write a function that will return true if the ransom note can be constructed from the magazines 
 * 			therwise, it will return false.
 * 			Each letter in the magazine string can only be used once in your ransom note.
 * 
 */

public class MinimumAbsoluteDifference {
	
	public boolean canConstruct(String ransomNote, String magazine) {
        
		int[] iArr = new int[26];
		
		for (char c : magazine.toCharArray()) 
			iArr[c-'a']++;
		
		for (char c : ransomNote.toCharArray()) 
			iArr[c-'a']--;
		
		for (int i = 0 ; i < iArr.length; i++) 
			if (iArr[i] < 0)
				return false;
		
		
		return true;
    }
	

	
	@Test
    public void test_Deck() {
		
		String ransomNote = "fffbfg";
		String magazine = "effjfggbffjdgbjjhhdegh";

		boolean result = canConstruct(ransomNote, magazine); 
		List<Integer> temp = new ArrayList<>();
		
        assertEquals(true, result); 
    }
}
