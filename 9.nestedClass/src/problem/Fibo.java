package problem;

public class Fibo {

	public static void main(String[] args) {
		System.out.println(fibo(7));
	}

	static int fibo(int n) {
		int result = 0;
		
		if (n == 1) {
			result = 0;
		} else if (n == 2) {
			result = 1;
		} else {
			result = fibo(n - 1) + fibo(n - 2);
		}
		
		return result;
	}
}
