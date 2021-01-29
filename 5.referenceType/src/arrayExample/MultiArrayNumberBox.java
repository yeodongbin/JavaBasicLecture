package arrayExample;

public class MultiArrayNumberBox {

	public static void main(String[] args) {
		int[][] numBox = new int[5][5];
		int num = 1;
	
		for (int i = 0; i < numBox.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < numBox[i].length; j++) {
					numBox[i][j] = num;
					num++;
				}
			} else {
				for (int j = numBox[i].length -1 ; j >= 0; j--) {
					numBox[i][j] = num;
					num++;
				}
			}
		}


		for (int i = 0; i < numBox.length; i++) {
			for (int j = 0; j < numBox[i].length; j++) {
				System.out.print(numBox[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
