package array;

public class StringClass {

	public static void main(String[] args) {

		String strVar1 = "������";
		String strVar2 = "������";

		if (strVar1 == strVar2)	{
			System.out.println("������ ����.");
		} else	{
			System.out.println("������ ���� �ʴ�.");
		}

		if (strVar1.equals(strVar2))	{
			System.out.println("���ڿ��� ����..");
		} else	{
			System.out.println("���ڿ��� ���� �ʴ�.");
		}

		String strVar3 = new String("������");
		String strVar4 = new String("������");

		if (strVar3 == strVar4)	{
			System.out.println("������ ����.");
		} else	{
			System.out.println("������ ���� �ʴ�.");
		}

		if (strVar3.equals(strVar4))	{
			System.out.println("���ڿ��� ����..");
		} else	{
			System.out.println("���ڿ��� ���� �ʴ�.");
		}
	}
}
