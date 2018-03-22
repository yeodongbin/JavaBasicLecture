package console.scanner;

import java.util.Scanner;
// 콘솔로 부터 기본 타임의 값을 바로 읽을 수 있다.
public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열 입력> ");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		System.out.println();

		System.out.print("정수 입력> ");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		System.out.println();

		System.out.print("실수 입력> ");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
	}
}
