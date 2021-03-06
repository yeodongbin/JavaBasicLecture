package tryCatchFinally;

public class TryCatchFinallyRuntimeExceptionExample {
	
	public static void main(String[] args) {
		String data1 = null; // 배열이 발생하지않을때
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[실행방법]");
			System.out.println("Run -> Run Configuations -> Arguments -> Program arguments");
			System.out.println("매개 변수 2개를 입력하세요");
			//return ;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); //NumberFormatException
			
			int result = value1+ value2;
			System.out.println(result);
		}
		catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}
	}
}
