package tryCatchFinally;

public class MultiCatchExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // NumberFormatException

			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Array Index Excepiotn  혹은 Number Format Exception");
		} catch (Exception e) {
			System.out.println("알수 없는 오류");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
