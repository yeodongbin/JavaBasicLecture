package tryCatchFinally;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {//일반예외 -> 빨간줄
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
