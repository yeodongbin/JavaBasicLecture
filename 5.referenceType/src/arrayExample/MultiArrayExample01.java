package arrayExample;

public class MultiArrayExample01 {
	public static void main(String[] args) {
		int[][] mArr1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		int[][] mArr2 = new int[3][2];
		mArr2[0][0] = 1;
		mArr2[0][1] = 2;
		mArr2[1][0] = 3;
		mArr2[1][1] = 4;
		mArr2[2][0] = 5;
		mArr2[2][1] = 6;

		System.out.println(mArr2.hashCode());
		System.out.println(mArr2);
		System.out.println();
		System.out.println(mArr2[0].hashCode());
		System.out.println(mArr2[0]);
		System.out.println(mArr2[1].hashCode());
		System.out.println();
		System.out.println(mArr2[0][0]);
		System.out.println(mArr2[0][1]);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(mArr2[i][j] + " ");
			}
			System.out.println();
		}

		for (int[] Arr : mArr2) {
			for (int value : Arr) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

		System.out.println(mArr2.length);
		System.out.println(mArr2[0].length);

		for (int i = 0; i < mArr2.length; i++) {
			for (int j = 0; j < mArr2[i].length; j++) {
				System.out.print(mArr2[i][j] + " ");
			}
			System.out.println();
		}

	}
}
