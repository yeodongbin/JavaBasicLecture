package arrayExample;
public class MultiArrayInit {
	public static void main(String[] args) {
		/*
		 * char a = 'a'; boolean tf = false;
		 *
		 * String name = "¿©µ¿ºó"; String name2 = "¿©µ¿ºó"; String name3 = new String("¿©µ¿ºó");
		 *
		 * tf = (name.equals(name3));
		 *
		 * System.out.println(name); System.out.println(tf);
		 */

		int[] num0 = { 83, 90, 87 };// 1
		int[] num = new int[5]; // 2
		num[0] = 100;
		num[1] = 90;
		num[2] = 80;

		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num.length);

		int[][] num1 = new int[2][3];
		num1[0][0] = 100;
		num1[1][0] = 90;
		num1[0][1] = 80;
		num1[1][1] = 70;
		num1[0][2] = 60;
		num1[1][2] = 50;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(num1[i][j]);
			}
		}

	}
}
