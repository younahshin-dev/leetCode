import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	914.X of a Kind In a Deck of Cards
 *
 * @desc	
 * 			In a deck of cards, each card has an integer written on it.
 *			Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:
 *			Each group has exactly X cards.
 *			All the cards in each group have the same integer.
 */

public class XofaKindInaDeckOfCards {
	
	public static boolean hasGroupsSizeX(int[] deck) {
		
		int N = deck.length;
		
		ArrayList<Integer> value = new ArrayList<Integer>();
		int[] count = new int[10000];
		
		for (int c : deck)
			count[c]++;
		
		for (int i = 0 ; i < 10000; i++)
			if (count[i] > 0)
				value.add(count[i]);
        
		search: for (int X = 2; X <= N; X++) 
			if (N%X == 0) {
				for(int v : value)
					if(v%X != 0) 
						continue search;
					
				return true;
				
			}
		
		return false;
		
    }
	

	
	@Test
    public void test_Deck() {
		int[] deck = {1,2,3,4,1,2,3,4};

		boolean result = hasGroupsSizeX(deck); // 함수 실행
		
        assertEquals(true, result); // 결과 확인
    }
}
