package arrayExample;

public class MultiArrayOper {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 3, 4 } };
		int[][] arr2 = { { 1, 2 }, { 3, 4 } };
		int[][] arr3 = new int[2][2];

		// Çà·Äµ¡¼À
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		// Çà·Ä»¬¼À
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		
		// Çà·Ä°ö¼À
		
		arr3[0][0] = arr1[0][0]*arr2[0][0]+arr1[0][1]*arr2[1][0];
		arr3[0][1] = arr1[0][0]*arr2[0][1]+arr1[0][1]*arr2[1][1];
		arr3[1][0] = arr1[1][0]*arr2[0][0]+arr1[1][1]*arr2[1][0];
		arr3[1][1] = arr1[1][0]*arr2[0][1]+arr1[1][1]*arr2[1][1];
		
		for (int i=0 ; i<2; i++) {
			for (int j=0 ; j<2; j++) {
				int temp = 0;
				for (int k=0; k<2 ;k++) { 
					temp += arr1[i][k]*arr2[k][j];
				}
				arr3[i][j] = temp;
			}
		}
		
		

		// Ãâ·Â
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

	

}
