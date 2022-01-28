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
        if(arr.length <3){
            return false;
        }

        int decreasingInflectionPoint = 0;
        int increasingInflectionPoint = 0;
        for(int i = 0; i+2<arr.length; i++){
            if(arr[i] <arr[i+1] && arr[i+1] > arr[i+2]){
                decreasingInflectionPoint++;
            }

            if(arr[i] >arr[i+1] && arr[i+1] < arr[i+2]){
                increasingInflectionPoint++;
            }

            if(arr[i] == arr[i+1]){
                return false;
            }

        }

        if(increasingInflectionPoint >0 || decreasingInflectionPoint != 1){
            return false;
        }

        return true;

    }

    @Test
    public void test_ValidMountainArray() {
        int[] nums = {1, 3, 2};
        //validMountainArray(nums);
        Assert.assertTrue(validMountainArray(nums));

    }

}
