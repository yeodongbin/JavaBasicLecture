package condition;
/*
���� : 0, ���� : 1, �� : 2
��� >>> �� : ����  �� : ���� ��� : �̰��. 
*/

public class GBB {
	public static void main(String[] args) {
		int my = 1;
		int com = (int) (Math.random() * 3);

		String myStr = "";
		String comStr = "";
		String resultStr = "";
		int result = (my - com + 2) % 3;

		if(result == 2)
			resultStr = "����";
		else if(result == 1)
			resultStr = "����";
		else
			resultStr = "�̰��";

		switch(my) {
			case 0 : myStr = "����";break;
			case 1 : myStr = "����";break;
			case 2 : myStr = "��";break;
		}

		switch(com) {
			case 0 : comStr = "����";break;
			case 1 : comStr = "����";break;
			case 2 : comStr = "��";break;
		}

		System.out.println("�� : " + myStr + "\t�� : " + comStr + "\t��� : " + resultStr);

	}

}
