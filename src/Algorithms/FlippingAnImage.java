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
 * @title	832. Flipping an Image
 *
 * @desc	
 * 			
 * 			Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 *          To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 *          To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 * 
 */

public class FlippingAnImage {
	
	 public int[][] flipAndInvertImage(int[][] A) {
		 int[][] result = new int[A.length][A[0].length];   
		 int length = A[0].length-1;
		 for (int i = 0; i < A.length; i++) {
			 for (int j = 0; j < A[i].length; j++) {
				 result[i][length-j] = A[i][j]^= 1;
			 }
		 }
		 
		 return result;
    }
	
 	@Test
    public void test() {
		int[][] input = {{1,1,0},{1,0,1},{0,0,0}};
		int[][] right = {{1,0,0},{0,1,0},{1,1,1}};
		
		int[][] result = flipAndInvertImage(input); // 함수 실행
		
        assertEquals(right, result); // 결과 확인
    }
}
