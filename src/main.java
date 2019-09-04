import java.io.IOException;
import java.util.HashMap;

public class main {

	public static void main(String[] args) throws IOException {
		
		int[] commands = {-2,-1,8,-1,6};
		int[][] obstacles = {{1,5},{-5,-5},{0,4},{-1,-1},{4,5},{-5,-3},{-2,1},{-2,-5},{0,5},{0,-1}};

		System.out.println(robotSim(commands, obstacles));
	}
	
	public static int robotSim(int[] commands, int[][] obstacles) {
		//x, y��, +,- ����
		char dimension = 'y';
		char direction = '+';
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < commands.length; i++) {
			//1.�����ΰ� ������ȯ�ΰ�
			if (commands[i] > 0) {
				//����
				if (dimension == 'x' && direction == '+') {
					x += commands[i];
				}
				
				if (dimension == 'x' && direction == '-') {
					x -= commands[i];
				}
				
				if (dimension == 'y' && direction == '+') {
					y += commands[i];
				}
				
				if (dimension == 'y' && direction == '-') {
					y -= commands[i];
				}
				
				if (obstacles.length > 0) {
					//��ֹ� -1 
					for (int j = 0; j < obstacles.length; j++) {
						if (dimension == 'x' && y == obstacles[j][1]) {
							if (direction == '+' && obstacles[j][0] > 0) {
								x = x >= obstacles[j][0] ? obstacles[j][0] - 1 : x;
							}
							if (direction == '-' && obstacles[j][0] < 0) {
								x = x <= obstacles[j][0] ? obstacles[j][0] + 1 : x;
							}
						}
						
						if (dimension == 'y' && x == obstacles[j][0]) {
							if (direction == '+' && obstacles[j][1] > 0) {
								y = y >= obstacles[j][1] ? obstacles[j][1] - 1 : y;
							}
							if (direction == '-' && obstacles[j][1] < 0) {
								y = y <= obstacles[j][1] ? obstacles[j][1] + 1 : y;
							}

						}
					}
				}
				
			} else {
				//������ȯ
				if ((dimension == 'x' && direction == '+') || (dimension == 'y' && direction == '-')) {
					if (commands[i] == -1) {
						direction = '-';
					}
					if (commands[i] == -2) {
						direction = '+';
					}
				}
				
				if ((dimension == 'x' && direction == '-') || (dimension == 'y' && direction == '+')) {
					if (commands[i] == -1) {
						direction = '+';
					}
					if (commands[i] == -2) {
						direction = '-';
					}
				}
				
				dimension = (dimension == 'x') ? 'y' : 'x';  
			}
			
			System.out.println("step ["+i+"] : ("+x+", "+y+")       dimension : "+dimension+"     direction : "+direction);
		}
		
		
		
		return x*x+y*y;
    }
}
