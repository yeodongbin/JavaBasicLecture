package problems;

public class Pro6 {
	public static void main(String[] args) {
		int num = 12345678;
		int sum = 0;

		for (int i = 1; num > 0; i++) {
			sum = sum + (num % 10); // 12345 -> 5
			num = num / 10; // 12345 -> 1234
		}


		while (num > 0) {
			sum = sum + (num % 10); // 12345 -> 5
			num = num / 10; // 12345 -> 1234
		}

		while (num > 0) {
			sum = sum + (num % 10); // 12345 -> 5
			System.out.println("num = " + (num % 10));
			num = num / 100; // 12345 -> 1234
		}

		System.out.println("sum = " + sum);
	}

}
