package condition;
public class IfElseTest2 
{
	public static void main(String[] args) 
	{
		//1 2 3 4 5, 13���� 24���� 5�ܱ���.
		int jumin = 3;
		String gender = "����";
		if(jumin % 2 == 0)
		{
			gender = "����";
		} else
		{
			if(jumin == 5)
			{
				gender = "�ܱ���";
			} 
			/*
			else
			{
				gender = "����";
			}
			*/
		}
		System.out.println(jumin + "�� " + gender + "�Դϴ�.");
	}
}
