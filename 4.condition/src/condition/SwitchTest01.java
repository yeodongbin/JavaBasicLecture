package condition;
public class SwitchTest01 {
	public static void main(String[] args) {
		int x = 8;
		
		switch(x) {
			case 10 : System.out.println("10입니다.");break;
			case 9 : System.out.println("9입니다.");break;
			case 8 : System.out.println("8입니다.");break;
			case 7 : System.out.println("7입니다.");
		}

		switch(x) {
			case 9 : case 8 : case 7 : case 6 : System.out.println("5보다 큽니다.");break;
			default : System.out.println("5보다 작습니다.");
		}
		System.out.println("프로그램 종료!!!!");
	}
}
