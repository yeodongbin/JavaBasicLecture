package arrayExample;

public class MultiArrayExample02 {

	public static void main(String[] args) {
		int[][] mArr = new int[2][3];
		System.out.println(mArr.length);
		System.out.println(mArr[0].length);
//		[] []
//		[] []
//		[] []
//		
//		[1] [2]
//		[3] [4] [5]
//		[6] [7] [8] [9]
		
		
		int[][] mArr3 = new int[3][];
		mArr3[0] = new int[2];
		mArr3[1] = new int[3];
		mArr3[2] = new int[4];
		
		mArr3[0][0] = 1;
		mArr3[0][1] = 2;
		mArr3[1][0] = 3;
		mArr3[1][1] = 4;
		mArr3[1][2] = 5;
		mArr3[2][0] = 6;
		mArr3[2][1] = 7;
		mArr3[2][2] = 8;
		mArr3[2][3] = 9;
		
		for (int[] Arr  : mArr3) {
			for (int value : Arr) {
				System.out.print(value+ " " );
			}
			System.out.println();
		}
		
	}

}
