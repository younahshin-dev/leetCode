package leetcode.algorithm;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        long val = 0;
        for (int i = 0; i < digits.length ; i++) {
            val = (val*10)+digits[i];
            System.out.println(val);
        }
        val += 1;

        Stack<Integer> s = new Stack<Integer>();
        boolean point = true;
        while( point ) {

            if (val%10 == val) {
                s.push((int) val);
                point = false;
            } else {
                s.push((int) (val%10));
                val = val/10;
            }
        }
        int i = 0;
        int[] result = new int[s.size()];
         while(!s.isEmpty()) {
             result[i] = (int) s.pop();
             i++;
         }


        return result;
    }

    @Test
    public void test_plusOne() {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        int[] result = {9,8,7,6,5,4,3,2,1,1};

        assertEquals(result, plusOne(nums));
    }
}

