package problem;

public class Pro7 {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		int sum =0;
		System.out.print(num1 + " " + num2 + " ");

		sum = num1 + num2;
		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			sum = sum + num3;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
			num3 =0;
		}

		System.out.print(" 피보나치 수열의 합 : " + sum);
	}
}
