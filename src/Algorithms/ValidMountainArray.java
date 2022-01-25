package Algorithms;
import org.junit.Assert;
import org.junit.Test;

/**
 * 941. Valid Mountain Array
 *
 *  Given an array of integers arr, return true if and only if it is a valid mountain array.
 *
 * Recall that arr is a mountain array if and only if:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int pointCnt = 0;
        boolean goingUp = true;
        boolean goingDown = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                goingDown = true;
                if (goingDown) {
                    pointCnt++;
                }

                if (goingUp) {
                    goingDown = true;
                    goingUp = false;
                }

            }
        }
        if (pointCnt == 1) {
            return true;
        }


        return false;
    }

    @Test
    public void test_ValidMountainArray() {
        int[] nums = {1, 3, 2};
        //validMountainArray(nums);
        Assert.assertTrue(validMountainArray(nums));

    }

}
