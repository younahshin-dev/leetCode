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
        
		char[] ransomArr = ransomNote.toCharArray();
		char[] magazineArr = magazine.toCharArray();
		
		HashMap<Object, Integer> ransomMap = new HashMap<Object, Integer>();
		HashMap<Object, Integer> magazineMap = new HashMap<Object, Integer>();
		
		for (char c : ransomArr) 
			ransomMap.put(c, ransomMap.getOrDefault(c, 0)+1);
		
		for (char c : magazineArr) 
			magazineMap.put(c, magazineMap.getOrDefault(c, 0)+1);
		
		for (char c : ransomArr) {
			if (!magazineMap.containsKey(c))
				return false;
			if (magazineMap.get(c) < ransomMap.get(c)) 
				return false;
		}
		
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
