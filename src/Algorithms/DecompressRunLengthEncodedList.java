package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList<T> {
	public int[] decompressRLElist(int[] nums) {
		boolean flag = false;
		List arr = new ArrayList(); 
		int value = nums[1];
        for (int i =1; i<= nums.length; i++) {
            if (i%2 == 0) {
        		for(int j = 1; j< nums[i-1]; j++) {
        			arr.add(value);
        		}
        		flag = true;
        	}
        	else {
        		value = nums[i];
        		flag = false;
        	}
        }
        
        int[] result = new int[arr.size()];
        for (int z = 0 ; z < arr.size(); z++) {
        	
            result[z] = (int) arr.get(z);
        }
        return result;
    }
}
