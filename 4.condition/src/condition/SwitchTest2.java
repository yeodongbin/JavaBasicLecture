package condition;
public class SwitchTest2 {
	public static void main(String[] args) {
		char ch = 'c';
		switch(ch) {
			case 97 : System.out.println("a�Դϴ�.");break;
			case 98 : System.out.println("b�Դϴ�.");break;
			case 99 : System.out.println("c�Դϴ�.");break;
			default : System.out.println("a b c�� �ƴմϴ�.");
		}

		String s = "java";
		switch(s) {
			case "hello" : System.out.println("hello�Դϴ�.");break;
			case "java" : System.out.println("java�Դϴ�.");break;
			case "!!!" : System.out.println("!!!!�Դϴ�.");break;
			default : System.out.println("���� �ƴմϴ�.");
		}
	}
}
