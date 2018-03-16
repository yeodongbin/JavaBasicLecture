package arrayIndexOutBoundsException;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		if (args.length == 2) {
			String data1 = args[0]; // 배열이 발생하지않을때
			String data2 = args[1];
			System.out.println("arg[0] : " + data1);
			System.out.println("arg[1] : " + data2);
		} else {
			System.out.println("[실행방법]");
			System.out.println("Run -> Run Configuations -> Arguments -> Program arguments");
			System.out.println("매개 변수 2개를 입력하세요");
		}
	}
}
