package inheritanceExample04;

public class TaxiUser {
	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		int km = 25;
		System.out.println("Current Spe " + km + "km�̵�!!!!");
		int price = taxi.calcPrice(km);
		// 25km �̵��� ���? : 5500��
		System.out.println(km + "km �̵��� ���? : " + price);
		// ���� �������? : 5500��
		System.out.println("���� �������? : " + taxi.totalPrice);

		km = 25;
		System.out.println("�������� �������? " + km + "km�̵�!!!!");
		price = taxi.calcPrice(km);
		// 25km �̵��� ���? : 5500��
		System.out.println(km + "km �̵��� ���? : " + price);
		// ���� �������? : 11000��
		System.out.println("���� �������? : " + taxi.totalPrice);

		// ���뿡�� ���� ������ �ҳ�Ÿ�ý�
		System.out.println(taxi.maker + "���� ���� " + taxi.carColor + " " + taxi.carName + "�ý�");

		taxi.speedUp();
		System.out.println("�ý� �ӵ� : " + taxi.speed);

		// taxi.initPrice(50);

		// �Ｚ���� ���� ��ȫ�� SM6�ý�
		Taxi taxi2 = new Taxi("SM6", "��ȫ��", "�Ｚ");
		// System.out.println(taxi2.maker + "���� ���� " +
		// taxi2.carColor + " " + taxi2.carName + "�ý�");
		System.out.println(taxi2.toString());
		System.out.println(taxi.toString() + "\t" + taxi2.toString());

		System.out.println(taxi.hashCode() + "\t" + taxi2.hashCode());

		Taxi taxi3 = new Taxi("SM6", "��ȫ��", "�Ｚ");
		/*
		 * ��DT == ��DT : ���� ��DT == ��DT : �ּҰ���
		 */
		if (taxi2 == taxi3)
			System.out.println("taxi2�� taxi3�� �ּҰ��� ���� �ý��̴�.");
		else
			System.out.println("taxi2�� taxi3�� �ּҰ��� �ٸ� �ý��̴�.");

		if (taxi2.equals(taxi3))
			System.out.println("taxi2�� taxi3�� ���̸��� ���� �ý��̴�.");
		else
			System.out.println("taxi2�� taxi3�� ���̸��� �ٸ� �ý��̴�.");

		System.out.println("taxi�� �ӵ��� 40ȸ ����");
		for (int i = 0; i < 40; i++)
			taxi.speedUp();
		System.out.println("taxi�� �ӵ� : " + taxi.speed);
	}
}
