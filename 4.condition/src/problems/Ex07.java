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
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("----------------------");
			System.out.print("����>");

			Scanner sc = new Scanner(System.in);
			keyCode = sc.nextInt();

			if (keyCode == 1) {
				System.out.print("���ݾ�>");
				inValue = sc.nextInt();
				balance = balance + inValue;
			} else if (keyCode == 2) {
				System.out.print("��ݾ�>");
				inValue = sc.nextInt();
				if (balance - inValue >= 0)
					balance = balance - inValue;
				else
					System.out.println("�ܾ��� �����ؿ�");
			} else if (keyCode == 3) {
				System.out.println("�ܰ�>" + balance);
			} else if (keyCode == 4) {
				run = false;
			}
		}

		System.out.println("���α׷� ����");
	}

}
