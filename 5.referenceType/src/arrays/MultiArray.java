package arrays;
public class MultiArray {
	public static void main(String[] args) {
		int[][] gugudan0 = {{9,1,9},
							{9,2,18},
							{9,3,27},
							{9,4,36},
							{9,5,45},
							{9,6,54},
							{9,7,63},
							{9,8,72},
							{9,9,81}};
		
		int[][] gugudan = new int[9][3];
					
		for (int i=0; i<9 ;i++){
			gugudan[i][0] = 9;
			gugudan[i][1] = (i+1);
			gugudan[i][2] = gugudan[i][0]*gugudan[i][1];
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(gugudan0[i][j]+" ");
			}
			System.out.println();
		}
	}
}
