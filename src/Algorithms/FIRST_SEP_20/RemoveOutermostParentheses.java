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
 * @title	709. To Lower Case
 *
 * @desc	
 * 			A valid parentheses string is either empty (""), "(" + A + ")", 
 * 			or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 *          A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
 *          Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
 *          Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
 * 
 * 
 */

public class RemoveOutermostParentheses {
	
	public String removeOuterParentheses(String S) {
        String result = "";
        char[] param = S.toCharArray();
        int cnt = 0;
        boolean open = true;
        
        for (int i = 0; i < param.length; i++) {
        	if (cnt == 0 && param[i] =='(') {
        		//여는 괄호
        		cnt++; 
        	}  else {
        		
        		if (param[i] =='(') cnt++; 
        		if (param[i] ==')') cnt--;
        		
        		if (cnt != 0) {
        			result += param[i];
        		}
        	}
        }
        
        return result;
    }
	
 	@Test
    public void test() {
		String str = "(()())(())";
		String result = removeOuterParentheses(str); // 함수 실행
		
        assertEquals("()()()", result); // 결과 확인
    }
}
