package variable;

public class VariableTest {

	public static void main(String[] args) {

		int var1 = 10;
		System.out.println(var1);

		int var2 = 010;
		System.out.println(var2);

		int var3 = 0x10;
		System.out.println(var3);

		// 10�� ���� value�� �ʱⰪ���� ����
		int value = 10;
		// ���� value ���� �а� 10�� ���ϴ� ��� ������ ����
		// ������ ������� ���� result�� �ʱⰪ���� ����
		int result = value + 10;
		// ���� result ���� �а� �ֿܼ� ���
		System.out.println(result);

		//���� ����
		int var4;
		if (true) {
			int var5;

			var4 = 10;
			var5 = 20;
		}

		var4 = 10;
		for (int i = 0; i < 1; i++) {
			int var6;

			var4 = 10;
		}
		var4 = 10;

		//VariableScope
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5;  //v2 ������ ����� �� ���� ������ ������ ������ ����

		//p38
		/////////////////////////////////////////////////////
		boolean flag = true;
		System.out.println("1. >>>>>" + flag);

		flag = false;
		System.out.println("2. >>>>>" + flag);

		char c = '0';
		System.out.println("c =====  " + c + "\t6" + (int) c);

		int age = 20;
		System.out.println("\t\t : " + (age + 5));

		boolean b;

		if (age < 30) {
			b = true;
		} else {
			b = false;
		}

		System.out.println("b ==== " + b);
	}
}
