package iteration;
/*
1. ���� : 1 - 45���� ����(0 ����)
2. ���δٸ� ���� 3��
���) ������ 1�� ���� ��÷��ȣ : 34 5 27
*/

public class WhileLotto {
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 3) + 1;
		int num2 = (int)(Math.random() * 3) + 1;
		int num3 = (int)(Math.random() * 3) + 1;

		/*
		while(num1 == num2 || num1 == num3 || num2 == num3) {
			num1 = (int)(Math.random() * 3
			) + 1;
			num2 = (int)(Math.random() * 3) + 1;
			num3 = (int)(Math.random() * 3) + 1;
		}
		*/

		while(true) {
			if(num1 != num2 && num1 != num3 && num2 != num3)
				break;

			num1 = (int)(Math.random() * 3) + 1;
			num2 = (int)(Math.random() * 3) + 1;
			num3 = (int)(Math.random() * 3) + 1;
		}

		System.out.println(" ������ ��÷ ���� ��ȣ : " + num1 + "\t" + num2 + "\t" + num3);
	}
}
