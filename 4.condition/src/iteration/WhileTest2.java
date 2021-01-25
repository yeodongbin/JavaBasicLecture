package iteration;

public class WhileTest2 {
	public static void main(String[] args) {
		int score;
		int a, b;
		a = 1;
		b = 0;

		while (a <= 100) {
			if (a % 3 == 0) {
				b = a + b;
			}
			a++;
		}

		System.out.println(b);
		return;
	}
}
