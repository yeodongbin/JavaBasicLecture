package arrayExample;

public class MultiArrayExample {
	public static void main(String[] args) {
		int[][] mArr = new int[3][2];
		mArr[0][0] = 1;
		mArr[0][1] = 2;
		mArr[1][0] = 3;
		mArr[1][1] = 4;
		mArr[2][0] = 5;
		mArr[2][1] = 6;
		
//		1 2
//		3 4
//		5 6
		
		System.out.println(mArr);
		System.out.println(mArr[0]);
		System.out.println(mArr[1]);
		System.out.println(mArr[2]);
		System.out.println(mArr[0][0]);
		System.out.println(mArr[0][1]);
		
		int[][] mArr2 = {{1,2},
						 {3,4},
						 {5,6}};
		
		int[][] mArr3 = new int[3][];
		mArr[0] = new int[2];
		mArr[1] = new int[3];
		mArr[2] = new int[4];
	}
}
