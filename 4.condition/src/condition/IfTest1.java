package condition;
public class IfTest1 
{
	public static void main(String[] args) 
	{
		//int x = 20;
		int x = 5; 
		int y = 10;
		if(x > y)
		{
			System.out.println(x + "�� " + y + "���� Ů�ϴ�.");
		}
		if(x < y)
		{
			System.out.println(x + "�� " + y + "���� �۽��ϴ�.");
		}
		if(x % 2 == 0)
		{
			System.out.println(x + "�� ¦���Դϴ�.");
		}
		if(x % 2 != 0)
		{
			System.out.println(x + "�� Ȧ���Դϴ�.");
		}
		System.out.println("���α׷� ����!!!");
	}
}
