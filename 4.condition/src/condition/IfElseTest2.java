package condition;
public class IfElseTest2 
{
	public static void main(String[] args) 
	{
		//1 2 3 4 5, 13남자 24여자 5외국인.
		int jumin = 3;
		String gender = "남자";
		if(jumin % 2 == 0)
		{
			gender = "여자";
		} else
		{
			if(jumin == 5)
			{
				gender = "외국인";
			} 
			/*
			else
			{
				gender = "남자";
			}
			*/
		}
		System.out.println(jumin + "는 " + gender + "입니다.");
	}
}
