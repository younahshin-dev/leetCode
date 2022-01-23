package Algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * For example, 121 is a palindrome while 123 is not.
 * 회문수 구하기
 *  @param {number} x
 *  @return {boolean}
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int tmp = x;

        int result =0;

        while(tmp > 0) {
            result = result*10 + tmp % 10;
            tmp = Math.floorDiv(tmp ,  10);
            System.out.println(result+" : "+tmp);

        }

        if (result == x) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void test_PalindromeNumber() {
        int roman = 121;
        boolean result = isPalindrome(roman);
        assertTrue(result);
    }

}
