package condition;

public class IDcodeCheck {

	public static void main(String[] args) {
		int code = 31; //���� ������
		String idCheck = "";
		
		if (code / 10 == 1) {// ����
			idCheck = "����";
			if (code % 10 == 1) { // ������
				idCheck = idCheck + ", ������";
			} else if (code % 10 == 2) { // �ܱ���
				idCheck = idCheck + ", �ܱ���";
			} else if (code % 10 == 3) { // �̼�����
				idCheck = idCheck + ", �̼�����";
			} else {
				idCheck = "��Ȯ�� ������ �Է��ϼ���.";
			}
		}
		if (code / 10 == 2) {// ����
			idCheck = "����";
			if (code % 10 == 1) { // ������
				idCheck = idCheck + ", ������";
			} else if (code % 10 == 2) { // �ܱ���
				idCheck = idCheck + ", �ܱ���";
			} else if (code % 10 == 3) { // �̼�����
				idCheck = idCheck + ", �̼�����";
			} else {
				idCheck = "��Ȯ�� ������ �Է��ϼ���.";
			}
		} else {
			idCheck = "��Ȯ�� ������ �Է��ϼ���.";
		}
		
		System.out.println(idCheck);
	}

}
