package leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int cnt = nums.length;

        int j = 0;
        for (int i = 0; i <  cnt ; i++) {

            if(nums[i] != val) {
                nums[i] = nums[j];
                j++;
            }
        }
        return j;
    }

    @Test
    public void test() {
        int[] nums = {3, 2, 2, 3};
        int val = 2;

        assertEquals(2, removeElement(nums, val));
    }
}

