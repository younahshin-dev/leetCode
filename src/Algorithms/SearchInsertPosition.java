package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

import common.TreeNode;

/*
 * 35. Search Insert Position
 * 
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * */

public class SearchInsertPosition {
	
	    public int searchInsert(int[] nums, int target) {
        int result = 0; 
        for(int i = 0; i < nums.length; i++) {
            if (nums[0] > target) return 0;
            if (nums[i] >= target) {
                return i;
            }
        }
        if (result == 0) return nums.length;
        return result;
    }
}
