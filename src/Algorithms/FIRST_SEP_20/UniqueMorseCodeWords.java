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
 * @title	804. Unique Morse Code Words
 *
 * @desc	
 * 			International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
 * 			as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 *			For convenience, the full table for the 26 letters of the English alphabet is given below:
 *			
 *			[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 *			
 *			Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. 
 *			For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
 *			Return the number of different transformations among all words we have.
 * 
 */

public class UniqueMorseCodeWords {
	
	public int uniqueMorseRepresentations(String[] words) {
		
		//Character.getNumericValue('a') = 10
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		char[] temp = new char[100];
		String convertMorse;
		HashMap arrayMorse =new HashMap<String, String>();
		for (String s : words) {
			convertMorse = "";
			temp = s.toCharArray();
			for (char c : temp) {
				convertMorse += morse[Character.getNumericValue(c)-10];
			}
			
			arrayMorse.put(convertMorse, "");
		}
		
		return arrayMorse.size();
    }
	
 	@Test
    public void test() {
		String[] words = {"gin", "zen", "gig", "msg"};

		int result = uniqueMorseRepresentations(words); // 함수 실행
		
        assertEquals(2, result); // 결과 확인
    }
}
