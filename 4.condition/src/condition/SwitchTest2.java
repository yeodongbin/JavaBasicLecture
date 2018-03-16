package condition;
public class SwitchTest2 {
	public static void main(String[] args) {
		char ch = 'c';
		switch(ch) {
			case 97 : System.out.println("a입니다.");break;
			case 98 : System.out.println("b입니다.");break;
			case 99 : System.out.println("c입니다.");break;
			default : System.out.println("a b c가 아닙니다.");
		}

		String s = "java";
		switch(s) {
			case "hello" : System.out.println("hello입니다.");break;
			case "java" : System.out.println("java입니다.");break;
			case "!!!" : System.out.println("!!!!입니다.");break;
			default : System.out.println("전부 아닙니다.");
		}
	}
}
