package condition;
public class SwitchTest01 {
	public static void main(String[] args) {
		int x = 8;
		
		switch(x) {
			case 10 : System.out.println("10�Դϴ�.");break;
			case 9 : System.out.println("9�Դϴ�.");break;
			case 8 : System.out.println("8�Դϴ�.");break;
			case 7 : System.out.println("7�Դϴ�.");
		}

		switch(x) {
			case 9 : case 8 : case 7 : case 6 : System.out.println("5���� Ů�ϴ�.");break;
			default : System.out.println("5���� �۽��ϴ�.");
		}
		System.out.println("���α׷� ����!!!!");
	}
}
