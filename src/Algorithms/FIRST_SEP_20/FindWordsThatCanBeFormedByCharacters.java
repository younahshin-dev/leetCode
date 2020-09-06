package Algorithms.FIRST_SEP_20;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;


/**
 * @title	1160. Find Words That Can Be Formed by Characters
 *
 * @desc	
 * 			You are given an array of strings words and a string chars.
 * 			A string is good if it can be formed by characters from chars (each character can only be used once).
 * 			Return the sum of lengths of all good strings in words.
 */

public class FindWordsThatCanBeFormedByCharacters {
	
	public int countCharacters(String[] words, String chars) {
		
		Map<Character, Integer> paramMap = new HashMap<Character, Integer>();
		
		for (char c : chars.toCharArray()) {
			paramMap.put(c, paramMap.getOrDefault(c, 0)+1);
		}
		
		Map<Character, Integer> tempMap = new HashMap<Character, Integer>();
		boolean check;
		int resultWord = 0;
		
		for (String word : words) {
			
			check = true;
			tempMap.clear();
		
			for (char ch : word.toCharArray()) {
				tempMap.put(ch, tempMap.getOrDefault(ch, 0)+1);
			}
			
			for (int i = 0; i< word.length(); i++) {
				if (paramMap.getOrDefault(word.charAt(i), 0) < tempMap.getOrDefault(word.charAt(i), 0)) {
					check = false;
					break;
				}
			}
			
			if (check) {
				resultWord += word.length();
			}
		}
		
        return resultWord;
    }
	

	
	@Test
    public void test_Deck() {
		String[] words = {"cat","bt","hat","tree"};
		String chars = "atach";
		int result = countCharacters(words, chars); // 함수 실행
		
        assertEquals(6, result); // 결과 확인
    }
}
