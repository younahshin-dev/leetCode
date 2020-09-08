package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Algorithms.FIRST_SEP_20.ToLowerCase;

/*
 * 1441. Build an Array With Stack Operations
 * 
 * Given an array target and an integer n. In each iteration, you will read a number from  list = {1,2,3..., n}.

	Build the target array using the following operations:
	
	Push: Read a new element from the beginning list, and push it in the array.
	Pop: delete the last element of the array.
	If the target array is already built, stop reading more elements.
	You are guaranteed that the target array is strictly increasing, only containing numbers between 1 to n inclusive.
	
	Return the operations to build the target array.
	
	You are guaranteed that the answer is unique.
 * */

public class BuildanArrayWithStackOperations {
	public List<String> BuildanArrayWithStackOperations(int[] target, int n) {
	        List<String> result = new ArrayList<String>();
	        
	        for(int i = 1; i <= n; i++) {
	        	boolean exist = false;
	        	for(int j = 0; j < target.length; j++ ) {
	        		if (target[j] == i) {
	        			exist = true;
	        		}
	        	}
	        	if (exist) result.add("Push");
	        	else {
	        		result.add("Push");
	        		result.add("Pop");
	        	}
	        	if (target[target.length-1] == i) {
	        		return result;
	        	}
	        }
	        
	        return result;
	}
	 
	@Test
	public void test_BuildanArrayWithStackOperations() {
		int[] target = {1, 3};
		List<String> result = BuildanArrayWithStackOperations(target, 3); 
		List<String> success = new ArrayList<String>();
		success.add("Push");
		success.add("Push");
		success.add("Pop");
		success.add("Push");
        assertEquals(success, result); 
	}
}
