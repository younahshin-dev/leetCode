package Algorithms;
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
 * 			Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 * 
 */

public class ToLowerCase {
	
	public String toLowerCase(String str) {
		return str.toLowerCase();
    }
	
 	@Test
    public void test() {
		String str = "Hello";

		String result = toLowerCase(str); // 함수 실행
		
        assertEquals("hello", result); // 결과 확인
    }
}
