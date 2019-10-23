package Algorithms;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.junit.Test;


/**
 * @title	557. Reverse Words in a String III
 *
 * @desc	
 * 			Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * 
 */

public class ReverseWordsinaString3 {
	
	public String reverseWords(String s) {
        
		String result = "";
		String str = "";
		String[] splitS = s.split(" ");
		
		Stack<Character> stack = new Stack<Character>(); 
		
		
		for(int j = splitS.length-1; j >= 0; j--) { 
			str = splitS[j];
			for(int i = 0; i < str.length(); i++)
				stack.push(str.charAt(i));
			if (j != 0 )
				stack.push(' ');
		}
		
		while(!stack.isEmpty())
			result += stack.pop();
		
		return result;
	}
	

	
	@Test
    public void test_Deck() {
		String param = "Let's take LeetCode contest";

		String result = reverseWords(param); // 함수 실행
		
        assertEquals("s'teL ekat edoCteeL tsetnoc", result); // 결과 확인
    }
}
