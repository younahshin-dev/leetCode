package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

import Algorithms.FIRST_SEP_20.ToLowerCase;

/*
 * 693. Binary Number with Alternating Bits
 * 
 	Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.	
 * */

public class BinaryNumberwithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
    	Stack<Integer> bits = new Stack();
    	
        while (n  > 0) {
        	bits.push(n%2);
        	n=n/2;
        }
        
        int check = 0;
        int temp = 0;
        while (!bits.empty()) {
        	temp = bits.pop();
        	check =  check^temp ;
        	if(check == 0) {
        		return false;
        	}
        	check = temp;
        }
        return true;
    }
	 
	@Test
	public void test_BuildanArrayWithStackOperations() {
		int target = 7;
		boolean result = hasAlternatingBits(target); 
        assertEquals(false, result); 
	}
}
