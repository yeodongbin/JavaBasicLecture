package conditionLoopFunction;

import java.util.Scanner;

public class TwentyPass {

	public static void main(String[] args) {

		boolean is = true;
		int keycode = 0;
		int me;
		int Q;
		int i = 21;

		Q = (int) (Math.random() * 100) + 1;
		
		while (is) {
			i--;
			if (keycode != 13 && keycode != 10) {
				System.out.println("-----------");
				System.out.println("   ������     ");
				System.out.println(" 1~100     ");
				System.out.println("-----------");
				System.out.println("��������" + i);
			}

			Scanner sc = new Scanner(System.in);
			me = sc.nextInt();
			
			if (i == 1) {
				System.out.println("������ �� ���̽��ϴ�");
				is = false;
				break;
			}

			if (me > Q) {
				System.out.println("�װͺ��� �����ϴ�.");
			} else if (me < Q) {
				System.out.println("�װͺ��� �����ϴ�.");
			} else if (me == Q) {
				System.out.println("�����մϴ�");
				System.out.println("������" + Q + "�����ϴ�.");
				is = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}
