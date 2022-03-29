package Algorithms;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

/**
 * 14. Longest Common Prefix
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * @param {string[]} strs
 * @return {string}
 */
public class LongestCommonPrefix {

    public String getlongestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }

    @Test
    public void test_LongestCommonPrefix() {
        String[] test = {"flower", "flow", "flight"};
        String result = getlongestCommonPrefix(test);
        assertEquals("fl", result);
    }
}
