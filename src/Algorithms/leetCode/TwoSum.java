package Algorithms;

import common.TreeNode;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(target-nums[i])) {
                result[0] = i;
                result[1] = indexMap.get(target-nums[i]);
                System.out.println("result : "+result[0]+", "+result[1]);
                return result;
            }
            indexMap.put(nums[i], i);
        }

        return result;
    }

    @Test
    public void test_twosum() {

        int[] nums = {3,2,3};
        int target = 6;

        int[] result = twoSum(nums, target);
        assertArrayEquals(new int[]{0, 2}, result);
    }
}
