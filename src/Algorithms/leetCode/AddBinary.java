package Algorithms.leetCode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * 67. Add Binary
 * Given two binary strings a and b, return their sum as a binary string.
 *
 *
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * */
public class AddBinary {
    public String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();

        int maxLen = Math.max(aLength, bLength);
        String res = "";
        int up = 0;
        int tempA = 0;
        int tempB = 0;
        int tempAdd = 0;
        for (int i = 0; i < maxLen; i++) {

            tempA = aLength > i ? a.charAt(aLength - 1 - i) -'0' : 0;
            tempB =bLength> i ? b.charAt(bLength - 1 - i) -'0' : 0;
            tempAdd = tempA + tempB + up;
            up = tempAdd >= 2 ?  tempAdd/2 : 0;
            tempAdd =tempAdd%2;
            res = tempAdd + res;

        }
        return up > 0 ? up+res:res;
    }

    @Test
    public void test_addBinary() {
        String a = "11";
        String b = "1";

        assertEquals("100", addBinary(a, b));
    }
}
