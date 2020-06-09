package iteration;

import java.util.Scanner;

public class NumOfCasesFunction {

	public static void main(String[] args) {
		int facN = 1;
		int facR = 1;
		int facNminR = 1;
		int NumOfCase = 1;
		int P = 0;
		int C = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("n> ");
		int n = sc.nextInt();
		System.out.print("r> ");
		int r = sc.nextInt();

		System.out.println(n + ", " + r);

		for (int i = 1; i <= r; i++) {
			NumOfCase *= n;
		}

		facN = factorial(n);
		facR = factorial(r);
		facNminR = factorial(n - r);

		P = facN / facNminR;// 순열공식
		C = P / facR; // 조합공식

		System.out.println(NumOfCase);
		System.out.println(P);
		System.out.println(C);
	}

	public static int factorial(int num) {
		int fac = 1;
		for (int i = 1; i <= num; i++) {
			fac = fac * i;
		}
		return fac;
	}
}
