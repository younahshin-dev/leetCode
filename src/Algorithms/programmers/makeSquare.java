package Algorithms.programmers;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;


/**
 * @title	프로그래밍 1
 *
 * @desc	
 * 직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때, 나머지 한 점의 좌표를 구하려고 합니다. 점 3개의 좌표가 들어있는 배열 v가 매개변수로 주어질 때, 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 return 하도록 solution 함수를 완성해주세요. 단, 직사각형의 각 변은 x축, y축에 평행하며, 반드시 직사각형을 만들 수 있는 경우만 입력으로 주어집니다.

제한사항
v는 세 점의 좌표가 들어있는 2차원 배열입니다.
v의 각 원소는 점의 좌표를 나타내며, 좌표는 [x축 좌표, y축 좌표] 순으로 주어집니다.
좌표값은 1 이상 10억 이하의 자연수입니다.
직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 [x축 좌표, y축 좌표] 순으로 담아 return 해주세요.
 */

public class makeSquare {
	
	public int[] makeSquare(int[][] v) {
		int[] pointXY = {0, 0};
		HashMap<String, Object> x = new HashMap<String, Object>();
		HashMap<String, Object> y = new HashMap<String, Object>();
		String xkey="";
		String ykey="";
		for (int i = 0; i < v.length; i++) {
			xkey = String.valueOf(v[i][0]); 
			ykey = String.valueOf(v[i][1]); 
			if (x.containsKey(xkey)) {
				x.put(xkey, "2");
			} else {
				x.put(xkey, "1");
 			}
			
			if (y.containsKey(ykey)) {
				y.put(ykey , "2");
			} else {
				y.put(ykey , "1");
			}
		}
		
		for (String key : x.keySet()) {
			xkey = (String) x.get(key);
			if (xkey.equals("1")) {
				pointXY[0] = Integer.parseInt(key); 
			}
		}
		
		for (String key : y.keySet()) {
			ykey = (String) y.get(key);
			if (ykey.equals("1")) {
				pointXY[1] = Integer.parseInt(key); 
			}
		}
		
		return pointXY;
    }
	

	
	@Test
    public void test_makeSquare() {
		int[][] v = {{1, 4}, {3, 4}, {3, 10}};
		int[] success = {1, 10};
		int[] result = makeSquare(v); // 함수 실행
		
        assertEquals(success, result); // 결과 확인
    }
}
