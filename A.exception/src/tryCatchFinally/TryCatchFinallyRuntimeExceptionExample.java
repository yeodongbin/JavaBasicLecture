package tryCatchFinally;

public class TryCatchFinallyRuntimeExceptionExample {
	
	public static void main(String[] args) {
		String data1 = null; // �迭�� �߻�����������
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[������]");
			System.out.println("Run -> Run Configuations -> Arguments -> Program arguments");
			System.out.println("�Ű� ���� 2���� �Է��ϼ���");
			//return ;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); //NumberFormatException
			
			int result = value1+ value2;
			System.out.println(result);
		}
		catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���");
		}
	}
}
