package Algorithms.FIRST_SEP_20;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * 1436. Destination City
 * 
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. 
 * Return the destination city, that is, the city without any path outgoing to another city.
 * It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
 * */

public class DestinationCity {
	public String destCity(List<List<String>> paths) {
		
		String destination = "";
		destination = paths.get(0).get(1);
		
		for (int i = 0; i< paths.size(); i++) {
			if (destination.equals(paths.get(i).get(0))) {
				destination = paths.get(i).get(1);
                i = 0;
			}
			
		}
        
		return destination;
    }
	
	@Test
	public void test_ShuffleString() {
		List<List<String>> listOLists = new ArrayList<List<String>>();
		List<String> singleList = new ArrayList<String>();
		List<String> secList = new ArrayList<String>();
		List<String> thirList = new ArrayList<String>();
		singleList.add("London");
		singleList.add("New York");
		listOLists.add(singleList);
		
		secList.add("New York");
		secList.add("Lima");
		listOLists.add(secList);
		thirList.add("Lima");
		thirList.add("Sao Paulo");
		listOLists.add(thirList);
		String result = destCity(listOLists); 
		
        assertEquals("Sao Paulo", result); 
	}
}
