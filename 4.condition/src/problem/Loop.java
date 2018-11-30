package problem;
public class Loop {
	public static void main(String[] args) {
		/*
		 * for (;;) { System.out.println("*"); }
		 * 
		 * while (true) { System.out.println("*"); }
		 * 
		 * for (i = 0, j = 1; i < 10; i++, j++) { System.out.println(i + " " + j); }
		 */

		int num1, num2, num3, num4, num5, num6, numB;
		num1 = (int) (Math.random() * 45) + 1;
		num2 = (int) (Math.random() * 45) + 1;
		num3 = (int) (Math.random() * 45) + 1;
		num4 = (int) (Math.random() * 45) + 1;
		num5 = (int) (Math.random() * 45) + 1;
		num6 = (int) (Math.random() * 45) + 1;
		numB = (int) (Math.random() * 45) + 1;

		for (;;) {
			if ((num1 != num2) && (num1 != num3) &&
				(num1 != num4) && (num1 != num5) &&
				(num1 != num6) && (num1 != numB) && 
				(num2 != num3) && (num2 != num4) &&
				(num2 != num5) && (num2 != num6) &&
				(num2 != numB) && 
				(num3 != num4) && (num3 != num5) &&
				(num3 != num6) && (num3 != numB) && 
				(num4 != num5) && (num4 != num6) &&
				(num4 != numB) && 
				(num5 != num6) && (num5 != numB) && 
				(num6 != numB)) 
			{
				break;
			}

			num1 = (int) (Math.random() * 45) + 1;
			num2 = (int) (Math.random() * 45) + 1;
			num3 = (int) (Math.random() * 45) + 1;
			num4 = (int) (Math.random() * 45) + 1;
			num5 = (int) (Math.random() * 45) + 1;
			num6 = (int) (Math.random() * 45) + 1;
			numB = (int) (Math.random() * 45) + 1;
		}

		System.out.println(num1 + " " + num2 + " " + 
		num3 + " " + num4 + " " + 
		num5 + " " + num6);
		System.out.println("보너스 번호 : " + numB);
	}

}
