package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

import common.TreeNode;

/*
 * 344. Reverse String
 * 
 * Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.
 * */

public class ReverseString {
	
	public void reverseString(char[] s) {
        for (int i =0; i <s.length/2; i++) {
            char temp = s[s.length-(i+1)];
            s[s.length-(i+1)] = s[i];
            s[i] = temp;
        }
    }
}
