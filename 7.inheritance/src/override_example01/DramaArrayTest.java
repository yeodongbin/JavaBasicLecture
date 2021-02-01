package override_example01;

public class DramaArrayTest {

	public static void main(String[] args) {
		TVProgram tvp[] = new TVProgram[4];
		tvp[0] = new Drama("�װܿ�", "SBS", "�����", "���μ�", "������");
		tvp[1] = new Drama("���", "MBC", "������", "����", null);
		tvp[2] = new Drama("���̸���", "KBS", "ǥ�μ�", "����", "�̴���");
		tvp[3] = new Drama("�ְ��", "KBS", "������", null, "������");

		int len = tvp.length;
		for (int i = 0; i < len; i++) {
			System.out.println(tvp[i]);
		}
	}
}
