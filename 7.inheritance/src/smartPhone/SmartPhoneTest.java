package smartPhone;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone("�Ｚ", "�����ó�Ʈ2", 850000);
		SmartPhone sp2 = new SmartPhone("����", "������7", 870000, 30);
		SmartPhone sp3 = new SmartPhone("�Ｚ", "������S3", 730000, 35);

		System.out.println("==== ��ǰ��� ====");
		System.out.println(sp1.getName() + "[" + sp1.getMaker() + "]");
		System.out.println("���� : " + sp1.getPrice() + "��");
		if(sp1.getDiscountRate() != 0)
			System.out.println("���ΰ��� : " + sp1.calculateDiscount() + "��");
		System.out.println("----------------------------------");
		System.out.println(sp2.getName() + "[" + sp2.getMaker() + "]");
		System.out.println("���� : " + sp2.getPrice() + "��");
		if(sp2.getDiscountRate() != 0)
			System.out.println("���ΰ��� : " + sp2.calculateDiscount() + "��");
		System.out.println("----------------------------------");
		System.out.println(sp3.getName() + "[" + sp3.getMaker() + "]");
		System.out.println("���� : " + sp3.getPrice() + "��");
		if(sp3.getDiscountRate() != 0)
			System.out.println("���ΰ��� : " + sp3.calculateDiscount() + "��");
		System.out.println("----------------------------------");
	}
}
