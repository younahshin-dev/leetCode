package leetcode.algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<Character, String>();

        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }

        String compareResult = "";
        for(int i = 0; i < pattern.length(); i++) {

            if (!map.containsKey((Character) pattern.charAt(i))) {
                if (map.containsValue(arr[i])) {
                    return false;
                }
                map.put((Character) pattern.charAt(i), arr[i]);
            }

            compareResult += map.get((Character) pattern.charAt(i));

        }
        s = s.replaceAll("\\s+", "");;
        return compareResult.equals(s);
    }

    @Test
    public void test() {
        String pattern = "abba";
        String example = "dog dog dog dog";

        Assert.assertEquals(false, wordPattern(pattern, example));

    }
}
