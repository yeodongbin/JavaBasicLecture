package condition;
public class IfElseTest01 
{
	public static void main(String[] args) 
	{
		int x = 5;
		int y = 10;
		if(x > y) {
			System.out.println(x + "는 " + y + "보다 큽니다.");
		} else {
			System.out.println(x + "는 " + y + "보다 작습니다.");
		}

		if(x % 2 == 0) {
			System.out.println(x + "는 짝수입니다.");
		} else {
			System.out.println(x + "는 홀수입니다.");
		}
		System.out.println("프로그램 종료!!!");
	}
}
