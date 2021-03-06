package Algorithms.FIRST_SEP_20;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	1200. Minimum Absolute Difference
 *
 * @desc	
 * 			Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements. 
 * 			Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
 * 			a, b are from arr
 * 			a < b
 * 			b - a equals to the minimum absolute difference of any two elements in arr
 */

public class RansomNote {
	
	 public List<List<Integer>> minimumAbsDifference(int[] arr) {
	    
	    List<List<Integer>> list=new ArrayList<>();
	    int min = Integer.MAX_VALUE;
	    
	    Arrays.sort(arr);
	    for (int i = 0; i < arr.length-1; i++) {
	       if(Math.abs(arr[i]-arr[i+1])==min){
	           list.add(Arrays.asList(arr[i],arr[i+1]));
	       } 
	        else if(Math.abs(arr[i]-arr[i+1])<min){
	            min=Math.abs(arr[i]-arr[i+1]);
	            list.clear();
	            list.add(Arrays.asList(arr[i],arr[i+1]));
	        }
	    }
	    return list;
    }
	

	
	@Test
    public void test_Deck() {
		int[] deck = {4,2,1,3};

		List<List<Integer>> result = minimumAbsDifference(deck); 
		List<List<Integer>> answer = new ArrayList<>();
		//how to initialize value of List<List<Object>> ???
		
        assertEquals(answer, result); 
    }
}
