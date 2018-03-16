package array;

public class StringClass {

	public static void main(String[] args) {

		String strVar1 = "여동빈";
		String strVar2 = "여동빈";

		if (strVar1 == strVar2)	{
			System.out.println("참조가 같다.");
		} else	{
			System.out.println("참조가 같지 않다.");
		}

		if (strVar1.equals(strVar2))	{
			System.out.println("문자열이 같다..");
		} else	{
			System.out.println("문자열이 같지 않다.");
		}

		String strVar3 = new String("여동빈");
		String strVar4 = new String("여동빈");

		if (strVar3 == strVar4)	{
			System.out.println("참조가 같다.");
		} else	{
			System.out.println("참조가 같지 않다.");
		}

		if (strVar3.equals(strVar4))	{
			System.out.println("문자열이 같다..");
		} else	{
			System.out.println("문자열이 같지 않다.");
		}
	}
}
