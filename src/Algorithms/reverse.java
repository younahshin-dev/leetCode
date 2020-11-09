import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class reverse {

  public static int proreverse(int x) {
        
        int result = 0;
        while(x > 0) {
          int rest = x%10;
          x/=10;
          result = result*10 + rest;
        }
		    
        return result;
        
  }
	 
	@Test
	public void test() {
		int x = -120;
		int y = -21;
		assertEquals(y, proreverse(x));
		
	}
}
