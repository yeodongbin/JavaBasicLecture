package conditionLoopFunction.homework;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;
		int keyCode = 0;
		int inValue;

		while (run) {
			System.out.println("----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------");
			System.out.print("선택>");

			Scanner sc = new Scanner(System.in);
			keyCode = sc.nextInt();

			if (keyCode == 1) {
				System.out.print("예금액>");
				inValue = sc.nextInt();
				balance = balance + inValue;
			} else if (keyCode == 2) {
				System.out.print("출금액>");
				inValue = sc.nextInt();
				if (balance - inValue >= 0)
					balance = balance - inValue;
				else
					System.out.println("잔액이 부족해요");
			} else if (keyCode == 3) {
				System.out.println("잔고>" + balance);
			} else if (keyCode == 4) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}

}
