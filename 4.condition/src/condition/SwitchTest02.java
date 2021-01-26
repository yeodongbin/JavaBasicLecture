package condition;
public class SwitchTest02 {
	public static void main(String[] args) {
		char ch = 'c';
		switch(ch) {
			case 97 : System.out.println("a.");break;
			case 98 : System.out.println("b");break;
			case 99 : System.out.println("c");break;
			default : System.out.println("a b c");
		}

		String s = "java";
		switch(s) {
			case "hello" : System.out.println("hello.");break;
			case "java" : System.out.println("java.");break;
			case "!!!" : System.out.println("!!!!.");break;
			default : System.out.println("default");
		}
	}
}
