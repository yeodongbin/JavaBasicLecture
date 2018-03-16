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
			System.out.println("Array Index Excepiotn  Ȥ�� Number Format Exception");
		} catch (Exception e) {
			System.out.println("�˼� ���� ����");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}
