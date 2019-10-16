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
import java.util.Stack;

import org.junit.Test;


/**
 * @title	917. Reverse Only Letters
 *
 * @desc	
 * 			Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, 
 * 			and all letters reverse their positions.
 * 
 */

public class ReverseOnlyLetters {
	
	public String reverseOnlyLetters(String S) {
		
		char[] clone = S.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		
		for (char c : S.toCharArray()) 
			if (Character.isLetter(c))
				stack.push(c);
		
		String result = "";
		for (int i = 0; i < clone.length; i++) {
			if (Character.isLetter(clone[i])) {
				result += stack.pop();
			} else {
				result += clone[i];
			}
		}
		
		return result;
    }
	
	@Test
    public void test_Deck() {
		
		String param1 = "Test1ng-Leet=code-Q!";

		String result = reverseOnlyLetters(param1); 
		
        assertEquals("Qedo1ct-eeLg=ntse-T!", result); 
    }
}
