package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * 500. Keyboard Row
 * 
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 * */

public class KeyboardRow {
	public String[] findWords(String[] words) {
        String[] result = null ;
		return result;
    }
	
	@Test
	public void test_findWords() {
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		String[] result = findWords(words); 
		String[] success = {"Alaska", "Dad"};
        assertEquals(success, result); 
	}
}
