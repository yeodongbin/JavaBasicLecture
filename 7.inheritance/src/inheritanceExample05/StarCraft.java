package inheritanceExample05;

public class StarCraft {
	public static void main(String[] args) {
		Marine my = new Marine();
		Marine com = new Marine();

		//��ü��	  ��ü��
		//ü�� : 100  ü�� : 100
		System.out.println(my + "\t" + com);
		System.out.println("���� ���� 2ȸ ����!!!!");
		for(int i=0;i<2;i++)
			my.attack(com);
		//ü�� : 100  ü�� : 80
		System.out.println(my + "\t" + com);
		System.out.println("���� ���� 6ȸ ����!!!!");
		for(int i=0;i<6;i++)
			com.attack(my);
		//ü�� : 40  ü�� : 80
		System.out.println(my + "\t" + com);
		System.out.println("���� ���� 4ȸ ����!!!!");
		for(int i=0;i<4;i++)
			my.attack(com);
		//ü�� : 40  ü�� : 40
		System.out.println(my + "\t" + com);
		System.out.println("�������� ��и��� ����");
		my.setMode(1);
		//ü�� : 15  ü�� : 40
		System.out.println(my + "\t" + com);
		System.out.println("���� ���� 1ȸ ����!!!!");
		my.attack(com);
		//ü�� : 15  ü�� : 15
		System.out.println(my + "\t" + com);
		System.out.println("�������� ��и��� ����");
		my.setMode(1);
		//ü���� 30�����̹Ƿ� ��庯�� �Ұ���.
		System.out.println(my + "\t" + com);

		System.out.println("���� ���� 1ȸ ����!!!!");
		my.attack(com);
		//ü�� : 15  ü�� : die
		System.out.println(my + "\t" + com);


		my.setMode(1);
		//ü�� : 15  ü�� : 40
		System.out.println(my + "\t" + com);
	}
}
