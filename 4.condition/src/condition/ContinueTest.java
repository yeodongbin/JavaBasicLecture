package condition;
public class ContinueTest {
	public static void main(String[] args) {
		while(true) {		
			int num = (int)(Math.random() * 10);

			if(num ==0) {
				System.out.println("0���� ������ ����. ���α׷� ����!!");
				break;
			}

			if(num == 4) {
				System.out.println("4�� �Ⱦ��!! : " + num);
				continue;
			}

			System.out.println("���� : " + 10/num);
		}
	}
}
