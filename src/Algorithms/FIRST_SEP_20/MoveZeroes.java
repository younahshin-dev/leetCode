package Algorithms.FIRST_SEP_20;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	283. Move Zeroes
 *
 * @desc	
 * 			Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 */

public class MoveZeroes {
	
	public void moveZeroes(int[] nums) {

		int j = -1;
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i]==0) {
				for (j = i+1; j< nums.length; j++) {
					if (nums[j] != 0) {
						nums[i] = nums[j];
						nums[j] = 0;
						break;
					}
				}
			}
		}
			
    }
	

	
}
