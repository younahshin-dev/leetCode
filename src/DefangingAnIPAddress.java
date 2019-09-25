import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;


/**
 * @title	1108. Defanging an IP Address
 *
 * @desc	
 * 			Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *			A defanged IP address replaces every period "." with "[.]".
 *			
 */

public class DefangingAnIPAddress {
	
	public String defangIPaddr(String address) {
	   
		char[] charAddr = address.toCharArray();
		String resultAddr = "";
		for (char c : charAddr)
			if (c != '.') {
				resultAddr += c;
			} else {
				resultAddr += "[.]";
			}
		
		return resultAddr;
    }
	 
	@Test
    public void test() {
		String address = "1.1.1.1";
		String result = defangIPaddr(address); // 함수 실행
		
        assertEquals("1[.]1[.]1[.]1", result); // 결과 확인
    }
}
