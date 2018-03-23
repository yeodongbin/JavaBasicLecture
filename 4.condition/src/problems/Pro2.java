package problems;

public class Pro2 {
	public static void main(String[] args) {
		int sum = 0;
		int totalSum = 0;

		for (int i = 1; i <= 28; i = i*3) {
			sum = sum + i;
			totalSum = totalSum + sum;
			System.out.println(totalSum + " " + sum
					+ " " + i);
		}

		System.out.println(totalSum);
		System.out.println(sum);
	}
}
