package arrayIndexOutBoundsException;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		if (args.length == 2) {
			String data1 = args[0]; // �迭�� �߻�����������
			String data2 = args[1];
			System.out.println("arg[0] : " + data1);
			System.out.println("arg[1] : " + data2);
		} else {
			System.out.println("[������]");
			System.out.println("Run -> Run Configuations -> Arguments -> Program arguments");
			System.out.println("�Ű� ���� 2���� �Է��ϼ���");
		}
	}
}
