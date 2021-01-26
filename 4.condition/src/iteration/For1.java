package iteration;

public class For1 {
	public static void main(String[] args) {
		// for (초기값;조건식;증감식) {실행문}
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) { // 짝수
				System.out.print(i + " ");
				sum = sum + i;
			}
		}
		System.out.println("-> even : " + sum);

		sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) { // 홀수
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println(" -> odd  : " + sum);

		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) { // 3의배수
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 10; i > 0; i--) {
			System.out.print(i + "\t");
		}
		System.out.println();

//		for (;;) {
//			System.out.println("!!!!!!");
//		}

		System.out.println("\n프로그램 종료\n");

	}
}
